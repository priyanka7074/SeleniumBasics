package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbyvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
        driver.findElement(By.linkText("REGISTER")).click();
		
		Select s1=new Select(driver.findElement(By.name("country")));
		
		
		s1.selectByValue("12"); //Value of Bahrain is 12

	}

}
