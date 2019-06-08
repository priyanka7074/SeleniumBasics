package Priyanka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firstscript {
	
	
	public static void main(String[] args) throws Exception {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//String baseUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	      
		
		 //driver.get(baseUrl);
		 
		
		 String expectedTitle = "Gmail";
	       String actualTitle = "";
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
    	
        String baseUrl1 = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        
          
        
        
        
        //String actualTitle1 = "";

        // launch Fire fox and direct it to the Base URL
        driver1.get(baseUrl1);
       

        // get the actual value of the title
        actualTitle = driver1.getTitle();
        
        //actualTitle1 = driver1.getTitle();
      
               
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver1.close();
        //driver1.close();
       
    }

}
