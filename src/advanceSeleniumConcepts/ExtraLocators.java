package advanceSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(new ByAll(By.name("firstname"), By.id("u_0_p"), By.xpath("//input[@name='firstname']"))).sendKeys("Priyanka");
		
		//Selenium will check firstname is matched by either ID or Name
        driver.findElement(new ByIdOrName("firstname")).sendKeys("Priyanka");
		
		//Parent to child chaining is created using ByChained
		driver.findElement(new ByChained(By.id("u_0_o"), 
		By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
		By.name("firstname"))).sendKeys("Priyanka");
	}

}
