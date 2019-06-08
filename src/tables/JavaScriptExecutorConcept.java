package tables;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.firefox.marionette", "C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.crmpro.com/index.html");

		driver.findElement(By.name("username")).sendKeys("priyankak");

		driver.findElement(By.name("password")).sendKeys("test@123");

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));

		flash(loginBtn, driver); //highlight the element
		
		drawBorder(loginBtn, driver);  //draw a border to circle the element in red
		
		//Take screenshot and store as a file format
		
		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		//now copy screenshot to desired location using copyfile method
				
	    FileUtils.copyFile(src, new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\src\\tables\\error.png"));
	    
	    //Generate alert message
	    
	    //generateAlert(driver, "There is an issue with Login page or Login button");
	    
	    clickElementByJS(loginBtn, driver); //click on any element by using JS Executor
	    
	    driver.navigate().refresh(); //refresh the page using selenium
	    
	    refreshBrowserByJS(driver); //refresh the page using JS executor
	    
	    System.out.println(getTitleByJS(driver)); //get the title of the page using JS
	    
	    System.out.println(getPageInnerText(driver)); //get the text displayed on the current webpage
	    
	    //scrollPageDown(driver); //scroll the page down
	    
	    WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
	    scrollIntoView(forgotPwdLink, driver); //scroll the page until you find the forgot password web element
				
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);

		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}

	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
			
	}
	
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
		
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
