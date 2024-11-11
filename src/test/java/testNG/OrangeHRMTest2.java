package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

/*1. Open application.
 2. Test presence of logo.
 3. Login.
 4. Close.
 */

public class OrangeHRMTest2 {

	WebDriver driver;
	
	@Test(priority = 1)	
	void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
	}
	
	@Test(priority = 2)
	void testLogo() {
		Boolean status = driver.findElement(By.xpath("//a[@class='navbar-brand']//img")).isDisplayed();
		System.out.println("Logo displayed..."+status);
	}
	
	@Test(priority = 3)
	void testLogin() {
			driver.findElement(By.xpath("//*[@id='navbar-collapse-header']/div/a[1]")).click();
	}
	
	@Test(priority = 4)
	void closeApp() {
		driver.close();
	}
}
