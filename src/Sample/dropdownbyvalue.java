package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownbyvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		WebElement w1=driver.findElement(By.linkText("REGISTER"));
		w1.click();
		
		WebElement w2=driver.findElement(By.name("country"));
		
		Select s1=new Select(w2);
		
		s1.selectByValue("12"); //Value of Bahrain is 12

	}

}
