package Practice.Self;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

//	Method One
	@Test(dataProvider="dataset")
	public void Test(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	
	@DataProvider
	public Object[][] dataset() {
		Object[][] credintial = new Object[3][2];
		credintial[0][0] = "Username-1";
		credintial[0][1] = "Password-1";
		
		credintial[1][0] = "Username-2";
		credintial[1][1] = "Password-2";
		
		credintial[2][0] = "Username-3";
		credintial[2][1] = "Password-3";
		
		return credintial;
	}
	
//	Method two
	@Test(dataProvider="Test Stubs")
	public void Test1(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@DataProvider(name="Test Stubs")
	public Object[][] dataset1(){
		return new Object[][] 
				{
			{"username*1", "password*1"},
			{"username*2", "password*2"},
			{"username*3", "password*3"}
			};
	}
}
