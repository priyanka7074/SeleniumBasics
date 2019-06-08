package testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
  @Test
  public void loginTest() {
	  System.out.println("Login test");
	 // int i = 9/0; //since login test method is failed the homepagetest method is skipped and not executed
  }
  
  @Test(dependsOnMethods = "loginTest")
  public void homePageTest() {
	  System.out.println("Home page test");
  }
  
  @Test(dependsOnMethods = "loginTest")
  public void searchPageTest() {
	  System.out.println("Search page test");
  }
  
  @Test(dependsOnMethods = "loginTest")
  public void regPageTest() {
	  System.out.println("Reg page test");
  }
  
  
}
