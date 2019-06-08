package testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
  @Test(invocationCount = 10) //the test case is executed 10 times
  public void sum() {
	  
	  int a=10;
	  int b=20;
	  int c = a+b;
	  System.out.println("The sum is:==="+c);
  }
}
