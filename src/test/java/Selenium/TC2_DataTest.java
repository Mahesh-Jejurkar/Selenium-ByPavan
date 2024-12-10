package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2_DataTest 
{
	@Test
	public void testData1() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		String actualItem = driver.findElement(By.xpath("(//*[@class='inventory_item_label']//a)[1]")).getText();
		String expectedItem = "Sauce Labs Backpack";
		System.out.println(actualItem);
		
		Assert.assertEquals(actualItem, expectedItem);

		Thread.sleep(5000);
		driver.close();
	}
}
