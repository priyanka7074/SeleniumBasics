package advanceSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectWebElement_Part3 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");

//		WebElement month = driver.findElement(By.id("month"));
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement year = driver.findElement(By.id("year"));
		
		String month_xpath = "//select[@id='month']//option";
		String day_xpath = "//select[@id='day']//option";
		String year_xpath = "//select[@id='year']//option";

		selectDropdownValue(month_xpath,"May");
		selectDropdownValue(day_xpath,"13");
		selectDropdownValue(year_xpath,"1993");
		
		driver.close();

	}
	
	public static void selectDropdownValue(String xpathValue, String value) {
		
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());

		for (int i = 1; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());

			if (monthList.get(i).getText().equals(value)) {
				monthList.get(i).click();
				break;
			}
		}

		
	}

}
