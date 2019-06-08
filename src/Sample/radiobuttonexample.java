package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttonexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("C:\\Users\\welcome\\Desktop\\Sample.html");
		
		
		WebElement rb1=driver.findElement(By.name("b3"));
		rb1.click();

		
		
		
		
		 
		 
		 
		 
		
	}

}
