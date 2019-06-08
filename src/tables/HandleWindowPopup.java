package tables;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[@class='black']")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
		
		String parentWindowId=it.next();
		System.out.println("Parent Window id:"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("Child Window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("Child window pop up title:"+driver.getTitle());
		driver.close();  //Child window pop up closes. Do not use quit as it will quit the whole browser.
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title:"+driver.getTitle());
		Thread.sleep(2000);
		
		driver.quit();
				
	}

}
