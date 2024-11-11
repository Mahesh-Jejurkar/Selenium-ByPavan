package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserLogin {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) throws Exception {
		
		switch(browser.toLowerCase()){
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser..."); break;
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@Test
	public void testUserLogin() throws Exception {
		driver.findElement(By.id("input-email")).sendKeys("jejurkar.mahesh@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Mahesh@1990");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "My Account");
	}
	

}
