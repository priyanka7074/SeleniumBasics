package testNG;

import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNGAssertion {
	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.firefox.marionette",
					"C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			// dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testEquality() {
		Assert.assertEquals(true, isEqual(10, 11));
		System.out.println("Priyanka Katarey");
	}

	public boolean isEqual(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Gmail");
		System.out.println("Priyanka");
	}

//	@AfterTest
//	public void closeBrowser() {
//		driver.quit();
//	}
}
