package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		String actual_title1 = driver.getTitle();
		String expected_title1 = "OrangeHRM";
		
		if(actual_title1.equals(expected_title1)) 
		{
			System.out.println("Application launched...\n Test Passed");
		}
		else 
		{
			System.out.println("Application failed...\n Test Failed.");
		}
		
		WebElement 	input_username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement input_password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button_login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		input_username.sendKeys("Admin");
		input_password.sendKeys("admin123");
		button_login.click();
		Thread.sleep(2000);
		
		String actual_title = driver.getTitle();
		String expected_title = "OrangeHRM";
		
		if(actual_title.equals(expected_title)) 
		{
			System.out.println("User logged in...\n Test Passed.");
		}
		else 
		{
			System.out.println("User loggin failed...\n Test Failed.");
		}
	
		Thread.sleep(10000);
		driver.close();
	}
}
