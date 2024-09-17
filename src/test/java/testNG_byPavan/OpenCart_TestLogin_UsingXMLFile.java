package testNG_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCart_TestLogin_UsingXMLFile {

	WebDriver driver;
	String url = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@Parameters({ "browser" })
	@BeforeClass
	void setup(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser");
			return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@Parameters({ "email", "password" })
	@Test(priority = 1)
	void testLogin(String email, String password) throws Exception {
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//div[@id='content']//h2[text()='My Account']")).isDisplayed();
		Assert.assertEquals(status, true);
	}

	@AfterClass
	void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

}
