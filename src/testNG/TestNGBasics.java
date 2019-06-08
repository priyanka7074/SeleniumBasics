package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// Preconditions annotations ---starting with @Before

	@BeforeSuite  //1
	public void setUp() {
		System.out.println("@BeforeSuite---Set up system property for firefox");
	}
	
	
	@BeforeTest  //2
	public void launchBrowser() {
		System.out.println("@BeforeTest---launch firefox browser");
	}

	@BeforeClass  //3
	public void login() {
		System.out.println("@BeforeClass---login to app");

	}


	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod---Enter URL");
	}

	// test cases starting with @Test
	@Test  //5
	public void googleTitleTest() {
		System.out.println("@Test---Google title test");
	}
	
	
	@Test
	public void searchTest() {
		System.out.println("@Test---Search Test");
	}
	
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test---Google Logo Test");
	}

	// Post conditions starting with @After
	@AfterMethod   //6
	public void logout() {
		System.out.println("@AfterMethod---logout from app");
	}
	
	
	@AfterClass   //7
	public void closeBrowser() {
		System.out.println("@AfterClass---Close browser");
	}

	
	@AfterTest  //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest---delete all the cookies");
	}

	
	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("generate the test reports");
	}
}

/*  
@BeforeSuite---Set up system property for firefox
@BeforeTest---launch firefox browser
@BeforeClass---login to app
@BeforeMethod---Enter URL
@Test---Google Logo Test
@AfterMethod---logout from app
@BeforeMethod---Enter URL
@Test---Google title test
@AfterMethod---logout from app
@BeforeMethod---Enter URL
@Test---Search Test
@AfterMethod---logout from app
@AfterClass---Close browser
@AfterTest---delete all the cookies
PASSED: googleLogoTest
PASSED: googleTitleTest
PASSED: searchTest  */
