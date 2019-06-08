package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://www.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("priyankak");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");

		String date = "31-September-2017";

		String dateArr[] = date.split("-"); // {18,September,2017}

		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);

		// div[@id='crmcalendar']//tr[3]//td[1]

		// div[@id='crmcalendar']//tr[3]//td[3]

		String before_xpath = "//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]//td[";

		final int totalWeekDays = 7;

		boolean flag = false;
		String dayValue = null;

		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= totalWeekDays; colNum++) {

				try {
					dayValue = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]"))
							.getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}

				System.out.println(dayValue);

				if (dayValue.equals(day)) {

					driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();
					break;
				}

			}
			if(flag) {
				break;
			}
		}
	}
}


//1- Click on calendar 
//2- Get all td of tables using findElements method 
//3- using for loop get text of all elements 
//4- using if else condition we will check specific date 
//5- If date is matched then click and break the loop. 
//6- Handle NoSuchElementException in case of (31st day) 
