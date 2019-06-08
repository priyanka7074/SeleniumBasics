package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com");
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Priority Check-in")).click();
		
		
		
	}

}
