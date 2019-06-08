package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class percent_calculator {

	public static void main(String[] args) {
		//private static WebDriver driver = null;
	    System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
		driver.get("http://www.calculator.net");
		// Use page Object library now
		page_objects_perc_calc.lnk_math_calc(driver).click();
		page_objects_perc_calc.lnk_percent_calc(driver).click();
		page_objects_perc_calc.txt_num_1(driver).clear();
		page_objects_perc_calc.txt_num_1(driver).sendKeys("10");
		page_objects_perc_calc.txt_num_2(driver).clear();
		page_objects_perc_calc.txt_num_2(driver).sendKeys("50");
	
		page_objects_perc_calc.btn_calc(driver).click();
		String result = page_objects_perc_calc.web_result(driver).getText();
		if(result.equals("5"))
		{
		System.out.println(" The Result is Pass");
		}
		else
		{
		System.out.println(" The Result is Fail");
		}
		driver.close();
		}

	}
