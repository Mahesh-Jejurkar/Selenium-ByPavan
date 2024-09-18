package opencart_PageFactoryModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage_2 loginpage;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1, dataProvider = "getLoginData", dataProviderClass = opencart_PageFactoryModel.DataProviderClass.class)
	public void testLogin(String email, String password) throws Exception {
		//LoginPage_1 loginpage = new LoginPage_1(driver);
		loginpage = new LoginPage_2(driver);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
		Thread.sleep(500);
		if(driver.getTitle().equals("My Account")) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
