package advanceSeleniumConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class DownloadFileConcept {

	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void  setUp() {
		//88887-33764-88765-99987
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		//chrome:
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		Map<String,Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups", 0); //disable popup
		prefs.put("download.default_directory", folder.getAbsolutePath()); //UUId will be generated
		
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(cap);	
	}
	
	@Test
	public void downloadFileTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		
		//wait for 2 secs to download the file
		Thread.sleep(2000);
		File listOfFiles[] = folder.listFiles();
		//make sure the directory is not empty
		//Assert.assertEquals(listOfFiles.length, is(not(0)));
		Assert.assertTrue(listOfFiles.length>0);
		
		for(File file:listOfFiles) {
			//make sure that downloaded file is not empty
			//Assert.assertEquals(file.length(), is(not((long)0)));
			Assert.assertTrue(file.length()>0);
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		for(File file: folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}
	
}
