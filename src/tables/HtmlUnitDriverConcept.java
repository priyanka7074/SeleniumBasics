package tables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Need to add the htmlunitdriver jar file externally
		
		WebDriver driver = new HtmlUnitDriver();
		
		//Advantages:
		//1. Testing is happening behind the scene---no browser launch
		//2. Execution of test cases is very fast ---Improves script performance
		//3. Not suitable for actions class (mouse movement/double click/drag and drop)
		//4. Also called Ghost driver/headless driver
		//5. Different types of headlesss driver
		     // htmlunitdriver - Java
		     // PhantomJ5 - Javscript
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.crmpro.com/index.html");
		
		System.out.println("Before login title is:"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("priyankak");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println("After login title is:"+driver.getTitle());
		
		
		
		
	}

}
