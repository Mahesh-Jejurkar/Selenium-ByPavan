package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locator_TagName 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link : allLinks) 
		{
			Thread.sleep(2000);
			String linkText = link.getText();
			String linkURL = link.getAttribute("href");
			System.out.println(linkText+"\n"+linkURL);
			action.moveToElement(link).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
			System.out.println("----------------------------------------------------------");
		}
		
		Thread.sleep(10000);
		driver.quit();
	}
}
