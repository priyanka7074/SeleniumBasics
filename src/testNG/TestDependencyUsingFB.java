package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDependencyUsingFB {
	WebDriver driver;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.firefox.marionette",
					"C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			// dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFB() {
		driver.findElement(By.id("email")).sendKeys("piya94");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).submit();
	}
}
