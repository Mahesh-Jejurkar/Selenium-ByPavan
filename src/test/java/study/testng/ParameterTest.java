package study.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterTest {
	WebDriver driver;
	WebDriverWait wait;
	
	@Parameters({"browser", "url"})
	@BeforeClass
	void setup(String browser, String url){
		switch(browser.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser");return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterClass
	void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority=1)
	void testLogo() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='custom-logo']")));
		Boolean status =	driver.findElement(By.xpath("//*[@class='custom-logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "Test Login | Practice Test Automation");
	}
	
	@Test(priority=3)
	void testURL() {
		String expectedURL = "https://practicetestautomation.com/practice-test-login/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
