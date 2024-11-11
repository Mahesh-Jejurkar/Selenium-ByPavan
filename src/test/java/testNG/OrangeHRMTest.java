package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/*1. Open application.
 2. Test presence of logo.
 3. Login.
 4. Close.
 */

//@Listeners(TestNGListener.class)
public class OrangeHRMTest {
	WebDriver driver;

	@BeforeClass
	void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void closeApp() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test(priority=1)
	void testURL() {
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/loginn";
		String actual_url =driver.getCurrentUrl();
		Assert.assertEquals(actual_url, expected_url);
	}
	
	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3, dependsOnMethods = "testURL")
	void testLogo() {
		Boolean status = driver.findElement(By.xpath("//*[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
}
