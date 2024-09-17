package testNG_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class OpenCart_TestLogin_DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "OpenCart_LoginData", dataProviderClass = testNG_byPavan.DataProviderMethods.class)
	void testLogin(String email, String password) throws Exception {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//div[@class='list-group']//a[text()='Logout']")).click();
		}else {
			Assert.fail();
		}
		Thread.sleep(2000);
	}
	
	@AfterClass
	void teardown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
}


