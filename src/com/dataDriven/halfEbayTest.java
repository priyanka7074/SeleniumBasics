package com.dataDriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class halfEbayTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
	} 
	    
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	    
	    
	
	@Test(dataProvider = "getTestData")
	public void halfEbayRegTestPage(String firstname, String lastname, String emailAddress, String address1, String address2, String city,String state, String zipcode) {
		
		//enter data
		
		//driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		
		//driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		
		//driver.findElement(By.xpath("//input[@name='userName']")).clear();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(emailAddress);
		
		//driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);
		
		//driver.findElement(By.xpath("//input[@name='address2']")).clear();
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(address2);
		
		//driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		
		//driver.findElement(By.xpath("//input[@name='state']")).clear();
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		
		//driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(zipcode);
	}
	
	 @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }

}
