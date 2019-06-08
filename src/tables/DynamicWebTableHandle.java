package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();

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
		WebElement w1 = driver.findElement(By.xpath("//input[@type='submit']"));
		w1.click();
		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		// form[@id='vContactsForm']//tr[4]//td[2]
		// form[@id='vContactsForm']//tr[5]//td[2]
		// form[@id='vContactsForm']//tr[6]//td[2]

		// Method 1:
//		String before_xpath = "//form[@id='vContactsForm']//tr[";
//		String after_xpath = "]//td[2]";
//
//		for (int i = 4; i <= 6; i++) {
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			System.out.println(name);
//			if (name.contains("nutan hing")) {
//				// form[@id='vContactsForm']//tr[5]//td[1]
//				// xpath for checking the checkbox
//
//				driver.findElement(By.xpath("//form[@id='vContactsForm']//tr[" + i + "]//td[1]")).click();
//
//			}
//
//		}
		
		//Method 2: Find the customized xpath concept using parent sibling terminology
		
		//a[contains(text(),'nutan hing')]/parent::td//preceding-sibling::td//input[@name='contact_id']
		
		driver.findElement(By.xpath("//a[contains(text(),'nutan hing')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();

	}

}
