package advanceSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectWebElement {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		String dob = "May-15-1976";
		String dobArr[] = dob.split("-");
		
		selectValueFromDropDown(month,dobArr[0]);
		selectValueFromDropDown(day,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);
		

	}
	
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}

}
