package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowngetoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		WebElement w1=driver.findElement(By.linkText("REGISTER"));
		w1.click();
		
		WebElement w2=driver.findElement(By.name("country"));
		
		Select s1=new Select(w2);
		
		List<WebElement> count=s1.getOptions();
		
		System.out.println(count.size()); //fetches the no of elements in the country dropdown which is 264
	}

}
