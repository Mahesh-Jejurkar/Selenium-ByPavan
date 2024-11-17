package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class DemoStudy1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	public void test1() {
		
		
	}
	

}

