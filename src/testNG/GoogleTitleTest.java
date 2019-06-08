package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


public class GoogleTitleTest {
	  WebDriver driver;

	  @BeforeMethod
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
	  }
	  
	  @Test()
	  public void googleTitleTest() {
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		Assert.assertEquals(title, "Google" ,"Title is not matched");

	  }
	  
	  @Test()
	  public void googleLogoTest() {
		  boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		  
		  Assert.assertTrue(b);
		  Assert.assertEquals(b, true);
	  }
//	  
//	  @AfterMethod
//	  public void tearDown() {
//		  driver.close();
//	  }
}
