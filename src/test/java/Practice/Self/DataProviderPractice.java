package Practice.Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPractice {

	@Test(dataProvider="Test Stubs")
	public void Test1(String username, String password) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.close();
	}
	
	@DataProvider(name="Test Stubs")
	public Object[][] dataset1(){
		return new Object[][] 
				{
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"}
			};
	}
}
