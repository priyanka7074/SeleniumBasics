package testNG;

import org.testng.annotations.*;

public class TestAnnotations {
	@Test
	public void f1() {
		System.out.println("Inside f1");
	}

	@Test
	public void f2() {
		System.out.println("Inside f2");
	}

	@BeforeTest
	public void beforeAnyTests() {
		System.out.println("Before any Test");
	}

	@AfterTest
	public void afterAllTheTests() {
		System.out.println("After all the tests");
	}

	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("Before every test method");

	}

	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("After every test method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}
}