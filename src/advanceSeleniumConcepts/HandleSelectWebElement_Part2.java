package advanceSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectWebElement_Part2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		
		//WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		//WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		
		select.selectByIndex(10);
		
		//Is multiselect dropdowndown available for webelement day
		System.out.println(select.isMultiple());
		
		//Get options
		List<WebElement> listDays = select.getOptions();
		System.out.println(listDays.size());
		int totalDays = listDays.size()-1;
		System.out.println("Total no. of days in day dropdown: "+totalDays);
		
		System.out.println("Day values from the dropdown are: ");
		for(int i=0;i<=totalDays;i++) {
			String dayValue = listDays.get(i).getText();
			System.out.println(dayValue);
			
			if(dayValue.equals("12")) {
				listDays.get(i).click();
				break;
			}
		}
		
		
		
	}

}
