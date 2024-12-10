package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts_2 extends BaseClass
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = getDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		String alerttext1 = alert1.getText();
		Thread.sleep(2000);
		alert1.accept();
		System.out.println(alerttext1);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(1000);
		alert3.sendKeys(" ");
		Thread.sleep(1000);
		alert3.sendKeys("Mahesh");
		Thread.sleep(2000);
		alert2.accept();
		
		closeDriver();
	}
}
