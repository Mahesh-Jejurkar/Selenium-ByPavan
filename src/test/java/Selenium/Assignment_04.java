package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment_04 extends BaseClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = getDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(5000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Mahesh");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement frame2 =	driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Dhruv");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Vaishali");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Deva");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[1]")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Sham");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://a9t9.com']")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//img[contains(@alt,'Image-Driven Automation')]")).isDisplayed();
		System.out.println(status);
		
		closeDriver();

	}
}
