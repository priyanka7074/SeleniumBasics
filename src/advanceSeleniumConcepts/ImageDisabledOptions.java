package advanceSeleniumConcepts;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ImageDisabledOptions {

	public static void main(String[] args) {
		
        //Chrome Launch:
//		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		disableImageChrome(options);
//		
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.amazon.com");
//		System.out.println(driver.getTitle());
		
		//Firefox Launch:
		System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		disableImageFirefox(options);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
	}

	// All the images on the website are disabled so that the script execution is
	// faster

	public static void disableImageChrome(ChromeOptions options) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);

		HashMap<String, Object> preferences = new HashMap<String, Object>();
		preferences.put("profile.default_content_setting_values", images);

		options.setExperimentalOption("prefs", preferences);
	}

	public static void disableImageFirefox(FirefoxOptions options) {
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);

	}

}
