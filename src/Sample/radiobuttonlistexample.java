package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttonlistexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("C:\\Users\\welcome\\Desktop\\Sample.html");
		
		List<WebElement> rb=driver.findElements(By.name("b4"));
		
		boolean b=false;
		
		b=rb.get(0).isSelected();
		
		if(b==true)
		{
			rb.get(1).click();
		}
		else
		{
			rb.get(2).click();
		}
	}
	

}
