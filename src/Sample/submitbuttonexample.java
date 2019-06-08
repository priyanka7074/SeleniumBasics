package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class submitbuttonexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
		
		WebElement w1=driver.findElement(By.id("ap_email"));
		w1.sendKeys("9848005390");
		
		WebElement w2=driver.findElement(By.id("ap_password"));
		w2.sendKeys("arjun123");
		
		WebElement w3=driver.findElement(By.id("signInSubmit"));
		w3.submit();
		
	}

}
