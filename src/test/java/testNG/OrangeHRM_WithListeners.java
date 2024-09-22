package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNG_byPavan.MyListenerClass.class)
public class OrangeHRM_WithListeners {
	WebDriver driver;
	String url = "https://tutorialsninja.com/demo/";
	
	@BeforeClass
	void setup(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void testLaunchApp() throws Exception {
		driver.get(url);
		Thread.sleep(2000);
		Assert.assertEquals(true, true);
	}
	
	@Test(priority = 2)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 3)
	void testURL() {
		//Assert.assertEquals(driver.getCurrentUrl(), url);
		Assert.fail();
	}
	
	@Test(priority = 4, dependsOnMethods = {"testURL"})
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}
	
	@AfterClass
	void tearDown() throws Exception {
		driver.close();
	}
	
}
