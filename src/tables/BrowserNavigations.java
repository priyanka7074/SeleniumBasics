package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com"); //to launch the url
		
		driver.navigate().to("http://www.amazon.com"); //switching to some external URL we use this command
		
		//back and forward button simulations
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
		driver.navigate().back();
		
		
		
		
		
		
	}

}
