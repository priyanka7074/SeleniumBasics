package tables;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertmessagehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //click on go button
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept(); //click on alert box's OK button
		
		//alert.dismiss(); //click on alert box's cancel button
		
		
	}

}
