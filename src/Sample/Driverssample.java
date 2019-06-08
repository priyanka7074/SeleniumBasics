package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class Driverssample {
	
	public static void main(String [] args)
	{
		

		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		//driver.get("https://www.google.com/?gws_rd=ssl");
		
		driver.navigate().to("https://www.google.com/?gws_rd=ssl");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		
		System.out.println(driver.getTitle());
	
	System.out.println(driver.getPageSource().length());
	//driver.quit();
	
	
		
		
	}

}
