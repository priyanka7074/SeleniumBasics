package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com");
		
		//Method 1
		
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		
		//Method 2
		
		//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Java");
		
		//Method 3 dynamic id
		//id=test_123
		//id=test_234
		//id=test_345
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_']")).sendKeys("Java");
		
		//Method 4 Xpath for links
		
		driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
	
	}

}
