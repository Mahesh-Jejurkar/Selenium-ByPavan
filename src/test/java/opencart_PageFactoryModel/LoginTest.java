package opencart_PageFactoryModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@Test
	public void testLogin() throws Exception {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterEmail("jejurkar.mahesh@gmail.com");
		loginpage.enterPassword("Mahesh@1990");
		loginpage.clickLogin();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
