package study.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	
	WebDriver driver;
	LoginPage2 loginPage;
	
	@BeforeClass
	public void setup() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void testLogin() {
		loginPage = new LoginPage2(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
}
