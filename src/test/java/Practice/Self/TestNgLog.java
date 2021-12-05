package Practice.Self;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgLog {

	@Test
	public void blogin() {
		System.out.println("Login Successfull test 1");
	}
	
	@Test
	public void alogout() {
		System.out.println("Logout Successfull test 2");
	}
	
	/*TestNg execute the methods in alphabetical order (abc)
	 * if we need to execute some method first then we need to prioritise the method
	 * with testng annotations*/
	
	// let's again try the same code

	@Test(priority=1, description = "this is alphabatically descending order will the priority is high so it will execute first")
	public void dlogin() {
		System.out.println("Login Successfull. test high priority");
	}
	
	@Test(priority=2, description="this is alphabatically acsending order will the priority is high so it will execute second")
	public void clogin() {
		System.out.println("logout Successfull. test second priority");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before anything execute this at the beggining");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("After All execute this");
	}
	@BeforeTest
	public void start() {
		System.out.println("Automation testing started");
	}
	
	@AfterTest
	public void end() {
		System.out.println("Automation testing ends");
	}
	
	@BeforeMethod
	public void DBconnectivity() {
		System.out.println("Database connected");
	}
	
	@AfterMethod
	public void DBdisconnectivity() {
		System.out.println("DataBase Disconnected");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class axecution");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class axecution");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("before any groups execution");
	}
	
	@AfterGroups(value="smoke")
	public void aftergroup() {
		System.out.println("after any groups execution");
	}

}
