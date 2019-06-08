package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableex1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		

//		driver.get("file:///C:/Users/welcome/Desktop/Sample.html");
//		
//		WebElement w1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]"));
//		System.out.println(w1.getText());
//		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"example\"]/thead/tr/th[3]"));
		w1.click();
		
	}

}
