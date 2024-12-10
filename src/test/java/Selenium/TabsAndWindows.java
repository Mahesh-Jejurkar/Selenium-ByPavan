package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TabsAndWindows extends BaseClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = getDriver();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		//Selenium 4.x
		//Opens in a new tab
		driver.switchTo().newWindow(WindowType.TAB);	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		closeDriver();
	}
}