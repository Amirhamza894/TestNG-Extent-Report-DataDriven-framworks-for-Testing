package Practice.Self;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderFile {
	@DataProvider(name="dataset")
	public Object[][] datasets() {
		Object[][] credin = new Object[3][2];
		credin[0][0] = "Username-1";
		credin[0][1] = "Password-1";
		
		credin[1][0] = "Username-2";
		credin[1][1] = "Password-2";
		
		credin[2][0] = "Username-3";
		credin[2][1] = "Password-3";
		
		return credin;
	}
	
	@DataProvider(name="Test Stubs")
	public Object[][] dataset2(){
		return new Object[][] 
				{
			{"username*1", "password*1"},
			{"username*2", "password*2"},
			{"username*3", "password*3"}
			};
	}
	
	@DataProvider(name="methodData")
	public Object[][] dataset(Method m){
		Object[][] testdata = null;
		if(m.getName().equals("testmethod")) {
			testdata = new Object[][] {
				{"username*1", "password*1"},
				{"username*2", "password*2"},
				{"username*3", "password*3"}
				};
		}
		else if(m.getName().equals("testmethod2")) {
			testdata = new Object[][]{
				{"username*1", "password*1", "testing"},
				{"username*2", "password*2", "testing"},
				{"username*3", "password*3", "testing"}
				};
		}
		return testdata;
	}

}
