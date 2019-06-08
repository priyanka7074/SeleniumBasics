package tables;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\src\\tables\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name")); //passes the name from the config.properties file
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String url1 = prop.getProperty("URL1");
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("username_Xpath"))).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath(prop.getProperty("password_Xpath"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.name(prop.getProperty("signin_btn_Name"))).click();
		
		driver.navigate().to(url1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("firstName_Xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastName_Xpath"))).sendKeys(prop.getProperty("lastName"));
		
		driver.findElement(By.xpath(prop.getProperty("city_Xpath"))).sendKeys(prop.getProperty("city"));
		
		WebElement w1 = driver.findElement(By.name(prop.getProperty("country_Name")));
		
		Select s1 = new Select (w1);
		
		s1.selectByVisibleText("ARUBA");
		
					
	}

}
