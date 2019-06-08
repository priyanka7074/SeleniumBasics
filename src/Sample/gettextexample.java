package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class gettextexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("C:\\Users\\welcome\\Desktop\\Sample.html");
		
		WebElement w1=driver.findElement(By.name("b1"));
		//w1.sendKeys("9848005390");
		
		
		
		System.out.println(w1.getText());

	}

}
