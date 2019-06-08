package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxwithcssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("C:\\Users\\welcome\\Desktop\\Sample.html");
		
		WebElement cb=driver.findElement(By.cssSelector("input[value='UG']"));
		
		cb.click();
		
	}

}
