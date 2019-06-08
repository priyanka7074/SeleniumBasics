package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tablefilterexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/table-records-filter-demo.html");
		
		WebElement w1=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[1]/div/button[1]"));
		w1.click();
		

		WebElement w2=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/section/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/div/div/h4/span"));
		
		if(w2.isDisplayed()) {
			System.out.println("Orange test passes");
			
		}
		else {
			System.out.println("Orange test failed");
			
		}
	}

}
