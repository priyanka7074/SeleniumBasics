package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathwithpost {
	public static void main(String[] args) {

		String sColValue = "Licensing";

		System.setProperty("webdriver.firefox.marionette", "C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/welcome/Desktop/Sample.html");

		for (int i = 1; i <= 3; i++) {
			String sValue = null;
			sValue = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[" + i + "]")).getText();
			System.out.println(sValue);
			if (sValue.equalsIgnoreCase(sColValue)) {

				// If the sValue match with the description, it will initiate one more inner
				// loop for all the columns of 'i' row
				for (int j = 2; j <= 3; j++) {
					String sRowValue = driver
							.findElement(By.xpath("/html/body/table/tbody/tr[" + j + "]/td[" + i + "]")).getText();
					System.out.println(sRowValue);
				}
				break;
			}
		}

	}

}
