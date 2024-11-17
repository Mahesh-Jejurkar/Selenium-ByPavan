package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessFirefox {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		 System.out.println(driver.getTitle());
		 
		 
		 Thread.sleep(9000);
		 driver.close();

	}

}
