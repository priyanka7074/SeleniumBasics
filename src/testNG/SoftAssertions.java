package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	 
SoftAssert softAssert = new SoftAssert();	
	

@Test	
public void test1() {
	 
SoftAssert softAssert1 = new SoftAssert();
	System.out.println("Open Browser");
	
	Assert.assertEquals(true, true,"Title not matching");
	Assert.assertTrue(true);
	
	
	System.out.println("Enter username");
	System.out.println("Enter password");
	System.out.println("Click on sign in button");
	
	Assert.assertEquals(true, true);  //Hard assert
	
	System.out.println("Validate home page");
	softAssert1.assertEquals(true, false, "Home page title is missing");
	
	System.out.println("Go to deals page");
	System.out.println("Create a deal");
	softAssert1.assertEquals(true, false);
	
	System.out.println("Go to contacts page");
	System.out.println("Create a contact");
	softAssert1.assertEquals(true, false);
	
	softAssert1.assertAll(); //assert all is required so that the overall TC execution should be marked as fail
}
	
	@Test
	public void test2() {
		SoftAssert softAssert2 = new SoftAssert();
		System.out.println("logout");
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
	}
	
	//Never use the below approach
//	@AfterClass
//	public void teardown() {
//		
//		softAssert.assertAll();
//	}
}


