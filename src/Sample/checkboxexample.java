package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("C:\\Users\\welcome\\Desktop\\Sample.html");

		List<WebElement> cb=driver.findElements(By.name("b5")); //Inter checkbox


		boolean b=false;

		cb.get(0).click();

		b=cb.get(1).isSelected();

		if(b==true)
		{
			cb.get(0).click();

		}
		else
		{
			cb.get(1).click();	
			cb.get(2).click();
		}

	}

}
