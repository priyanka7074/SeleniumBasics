package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;

	@Test
	@Parameters({ "env", "browser", "url", "emailId" })
	public void yahooLoginTest(String env, String browser, String url, String emailId) {
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

	}

}
