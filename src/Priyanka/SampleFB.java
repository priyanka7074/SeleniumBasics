package Priyanka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleFB {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
				
			      
				
				 //driver.get(baseUrl);
				 
				
				 String expectedTitle = "Gmail";
			       String actualTitle = "";
			       
			       driver.get(baseUrl);
			       Thread.sleep(5000);
			       
			       actualTitle = driver.getTitle();
			       if (actualTitle.contentEquals(expectedTitle)){
			            System.out.println("Test Passed!");
			        } else {
			            System.out.println("Test Failed");
			        }
			       driver.close();
			       

	}

}
