package Practice.Self;

import org.testng.annotations.Test;

@Test(groups="user-account-usage")
public class GroupsTestNG {

	@Test(groups="regression")
	public void profilepic() {
		System.out.println("Changed profile picture");
	}
	
	@Test(groups="regression")
	public void profilepostarticle() {
		System.out.println("Profile Article Posted");
	}
	
	@Test(priority=2, groups= {"regression", "smoke"})
	public void login() {
		System.out.println("Login Successfull");
	}
	
	@Test(priority = 1, groups="smoke")
	public void logout() {
		System.out.println("Logout Successfull");
	}

}
