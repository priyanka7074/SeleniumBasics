package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownprintvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
        driver.findElement(By.linkText("REGISTER")).click();
		
		Select s1=new Select(driver.findElement(By.name("country")));
		
		List<WebElement> count=s1.getOptions();
		
		int size=count.size();
		
		for(int i=0;i<size;i++) {
			String svalue=count.get(i).getText();
			System.out.println(svalue);
		}
	}

}
