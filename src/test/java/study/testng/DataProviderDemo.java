package study.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "loginData")
	void login(String username, String password) throws Exception {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='submit']")).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
		Boolean result = driver.findElement(By.xpath("//h1")).isDisplayed();
		Assert.assertEquals(result, true);
	}

	@AfterClass
	void teardown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@DataProvider(name="loginData",indices = {0,2,3})
	Object[][] loginData() {
		Object[][] data = {{"student","Password123"}, 
							{"Admin1","admin12345"}, 
							{"student","Password123"},
							{"Admin2","admin12345"}};
		
		return data;
	}
	
	@DataProvider(name="loginData2")
	Object[][] loginData2() {
		Object[][] data = {{"student","Password123"}, 
							{"Admin1","admin12345"}, 
							{"student","Password123"},
							{"Admin2","admin12345"}};
		
		return data;
	}
}
