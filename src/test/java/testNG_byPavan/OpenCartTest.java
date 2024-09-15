package testNG_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. Open application.
// 2. Test logo presence.
// 3. Test login.
// 4. Close.

import org.testng.annotations.Test;

public class OpenCartTest {
	WebDriver driver;
	
	@Test(priority=1)
	void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@Test(priority=2)
	void testLogo() throws Exception {
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
		System.out.println("Logo displayed... "+status);
	}
	
	@Test(priority=3)
	void testLogin() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jejurkar.mahesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Mahesh@1990");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Test(priority=4)
	void testLogout() {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//ul//a[text()='Logout']")).click();
	}
	
	@Test(priority=5)
	void closeApp() {
		driver.close();
	}
}
