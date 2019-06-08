package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://html.com/input-type-file/");
		//type="file" should be present for browse/attach file/upload file buttons
		driver.findElement(By.name("fileupload")).sendKeys("D:\\Selenium\\Difference between selenium IDE.docx");
	}

}
