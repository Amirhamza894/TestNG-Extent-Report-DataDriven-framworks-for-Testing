package Practice.Self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyTitle {

	@Test(groups="regression")
	public void title() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
	}
	
	@Test
	public void wrongtitle() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		SoftAssert softassert = new SoftAssert();
		
		String expectedtitle = "Electronics, Cars, sfgaFashion, Collectibles & More | eBay";
		String actualtitle = driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle, "title of the site");
		String expectedbtntxt = "Search";
		String actualbtntxt = driver.findElement(By.xpath("//input[@id='gh-btn']")).getText();
		softassert.assertEquals(actualbtntxt, expectedbtntxt);
		driver.close();
		softassert.assertAll();
		
	}

}
