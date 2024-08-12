package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(LaunchGoogleListener.class)

public class LaunchGoogle {

	WebDriver driver;

	@Test(priority = 0)
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser launched.");
	}

	@Test(priority = 1)
	public void launchApplication() throws Exception {
		Thread.sleep(2000);
		driver.get("http://www.google.co.in");
		Reporter.log("Google searched.");
	}

	@Test(priority = 2)
	public void searchAndClick() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title = 'Search']")).sendKeys("Facebook", Keys.ENTER);
		Reporter.log("The text Facebook typed.");
	}

	@Test(priority = 3)
	public void verifyPageTitle() throws Exception {
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook - Google Search", "Title Matched.");
		Reporter.log("Title verified.");
	}

	@Test(priority = 4)
	public void closeBrowser() throws Exception {
		Thread.sleep(5000);
		driver.close();
		Reporter.log("Driver closed...");
	}
}
