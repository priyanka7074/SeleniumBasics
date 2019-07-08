package advanceSeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]

		String before_xpath_company = "//*[@id=\"customers\"]/tbody/tr[";
		String after_xpath_company = "]/td[1]";

		String before_xpath_contact = "//*[@id=\"customers\"]/tbody/tr[";
		String after_xpath_contact = "]/td[2]";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total no. of rows = " + (rows.size() - 1));
		int rowCount = rows.size();
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\src\\advanceSeleniumConcepts\\FreeCrmTestData.xlsx");
		
		if(!reader.isSheetExist("TableData")) {
			reader.addSheet("TableData");
			reader.addColumn("TableData", "CompanyName");
			reader.addColumn("TableData", "ContactName");
		}
		
	
		for (int i = 2; i <= rowCount; i++) {
			String actual_xpath_company = before_xpath_company + i + after_xpath_company;
			String companyName = driver.findElement(By.xpath(actual_xpath_company)).getText();
			System.out.println(companyName);
			reader.setCellData("TableData", "CompanyName", i, companyName);

			String actual_xpath_contact = before_xpath_contact + i + after_xpath_contact;
			String contactName = driver.findElement(By.xpath(actual_xpath_contact)).getText();
			System.out.println(contactName);
			reader.setCellData("TableData", "ContactName", i, contactName);

		}

		driver.quit();

	}

}
