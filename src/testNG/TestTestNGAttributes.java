package testNG;

import org.testng.annotations.*;

public class TestTestNGAttributes {
	@Test(priority = 0)
	public void d() {
	}

	@Test(dependsOnMethods = {"f"})
	public void e() {
	}

	@Test(priority = 89)
	public void o() {
	}

	@Test(enabled=false)
	public void h() {
	}

	@Test(priority = 34)
	public void f() {
	}

	@Test(priority = 3)
	public void m() {
	}
}
//if your test case are prioritized then priority comes before alphabetical order
//if there is no priority given to any test case then that test case is executed first since alphabetical order takes precedence over priority
//if the alphabetical order is higher with no priority then the lowest priority test case is executed first
//if there is priority along with dependency then all the priority test cases will run first and then the dependency test
//if enabled=false then that test case will not be executed
