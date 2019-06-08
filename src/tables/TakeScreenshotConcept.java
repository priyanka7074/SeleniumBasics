package tables;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		//Take screenshot and store as a file format
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//now copy screenshot to desired location using copyfile method
		
		FileUtils.copyFile(src, new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\src\\tables\\screenshot.png"));
		
			
	}

}
