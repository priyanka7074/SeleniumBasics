package tables;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("priyankak");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");

		// 1. get the list of all the links and images:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of full links and images---->" + linksList.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2. Iterate linkList : exclude all the links/images which doesn't have any href attribute
		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			if (linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));

			}
		}

		// 3. get the size of active links list
		System.out.println("Size of active links and images---->" + activeLinks.size());
		
		//4.Check the href url with http connection api:
		//200 --- ok
		//404 --- not found
		//500 --- internal error
		//400 --- bad request
		
		for(int j=0;j<activeLinks.size();j++) {
			
		HttpURLConnection connection =	(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage(); //if the link is perfectly fine it will return ok otherwise it will return an error
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
		
		
		}
	}

}
