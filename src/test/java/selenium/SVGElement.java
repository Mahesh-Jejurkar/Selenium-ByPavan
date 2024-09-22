package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SVGElement extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//*[name()='svg']")).click();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Timesheets']//*[name()='svg']")).click();
		Thread.sleep(2000);
		
		
		closeDriver();
	}
}