package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectmultiselectedelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/welcome/Desktop/Sample.html");
		
		WebElement w1=driver.findElement(By.name("CARS"));
		
		Select s1=new Select(w1);
		
		s1.selectByValue("Honda");
		s1.selectByValue("Kia");
		
		//1. deselect all the selected elements
		//s1.deselectAll(); 
		
		//2. deselects the elements based on index values
		//s1.deselectByIndex(0);
		//s1.deselectByIndex(3); 
		
		//3. deselects elements based on value
		//s1.deselectByValue("Honda");
		
		//4. deselects elements based on visible text
		s1.deselectByVisibleText("Kia");
		
	}

}
