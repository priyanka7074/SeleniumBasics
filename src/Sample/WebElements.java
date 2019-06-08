package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		WebElement w1=driver.findElement(By.id("identifierId"));
		w1.sendKeys("piya94");
		
		WebElement w2=driver.findElement(By.id("identifierNext"));
		w2.click();
		
		WebElement w3=driver.findElement(By.className("rFrNMe"));
		boolean st=w3.isDisplayed();
		
		System.out.println(""+st);
		

	}

}
