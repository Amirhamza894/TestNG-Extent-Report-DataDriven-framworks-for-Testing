package Practice.Self;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgXMLparameter {

	@Parameters({"browser"})
	@Test
	public void launchApplication(String browser) {
		if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com/");
		}
	}


}
