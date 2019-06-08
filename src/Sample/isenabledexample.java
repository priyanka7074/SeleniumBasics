package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isenabledexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		
		
		driver.navigate().to("C:\\Users\\welcome\\Desktop\\Sample.html");
		
		WebElement w3=driver.findElement(By.name("b1"));
		boolean st=w3.isEnabled();
	
		
		
		System.out.println(""+st);
		
		
		
	}

}
