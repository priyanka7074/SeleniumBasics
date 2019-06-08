package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;

  @BeforeMethod
  public void setUp() {
	    System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
  }
  
  @Test(priority = 1,groups = "title")
  public void googleTitleTest() {
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  
  @Test(priority = 3,groups = "logo")
  public void googleLogoTest() {
	  boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	  System.out.println(b);
  }
  
  @Test(priority = 2,groups = "link test")
  public void mailLinkTest() {
	  boolean l = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	  System.out.println(l);
	  
  }
  
  @Test(priority = 4,groups = "test")
  public void test1() {
	  System.out.println("test1");
  }
  
  
  @Test(priority = 5,groups = "test")
  public void test2() {
	  System.out.println("test2");
  }
  
  
  @Test(priority = 6,groups = "test")
  public void test3() {
	  System.out.println("test3");
  }
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
