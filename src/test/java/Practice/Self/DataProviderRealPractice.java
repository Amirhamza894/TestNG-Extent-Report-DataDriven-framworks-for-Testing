package Practice.Self;

import org.testng.annotations.Test;

public class DataProviderRealPractice {

	@Test(enabled=false,dataProvider="dataset", dataProviderClass = DataProviderFile.class)
	public void Test(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@Test(enabled =false, dataProvider="Test Stubs", dataProviderClass = DataProviderFile.class)
	public void Test1(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@Test(dataProvider="methodData", dataProviderClass = DataProviderFile.class)
	public void testmethod(String username, String password) {
		System.out.println(username+"---"+password);
	}
	
	@Test(dataProvider="methodData", dataProviderClass = DataProviderFile.class)
	public void testmethod2(String username, String password, String test) {
		System.out.println(username+"---"+password+"---"+test);
	}
}
