package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsLinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com");
		
		//get the total count of all the links on the page
		//get the text of each link on the page
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		//size of linkList
		
		System.out.println(linkList.size());
		
		//get text of each link
		
		for(int i=0; i<linkList.size(); i++) {
			String linkText=linkList.get(i).getText();
			System.out.println(linkText);
			
		}
			

	}

}
