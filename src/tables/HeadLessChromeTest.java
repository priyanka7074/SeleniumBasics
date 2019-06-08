package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Mandatory options:
		//1. chrome version >59 to run on mac and >60 to run on windows
		//2. window size = 1400,800
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless"); //for headless browser
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.crmpro.com/index.html");
		System.out.println("Login page title:="+driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("priyankak");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Home page title:="+driver.getTitle());
	

	}

}
