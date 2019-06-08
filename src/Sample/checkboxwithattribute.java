package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxwithattribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("C:\\Users\\welcome\\Desktop\\Sample.html");

		List<WebElement> cb=driver.findElements(By.name("b5"));




		int s=cb.size();

		for (int i=0;i<s;i++) {
			String svalue=cb.get(i).getAttribute("value");

			if(svalue.equalsIgnoreCase("Inter")) {
				cb.get(i).click();
				
			}
		   if(svalue.equalsIgnoreCase("UG")) {
				cb.get(i).click();
				
				
			}
		  if(svalue.equalsIgnoreCase("PG"))
				cb.get(i).click();
				
			}
		}


	}


