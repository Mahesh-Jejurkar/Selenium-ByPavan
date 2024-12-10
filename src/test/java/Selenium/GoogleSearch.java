package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch extends BaseClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = getDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		Thread.sleep(4000);
		List<WebElement> searchResult = driver.findElements(By.xpath("//ul[@role='listbox']/li//span"));
		for(WebElement sr : searchResult) 
		{
			System.out.println(sr.getText());
		}
		
		for(WebElement sr : searchResult) 
		{
			String name = sr.getText();
			if(name.equalsIgnoreCase("Selenium Webdriver")) 
			{
				sr.click();
				break;
			}
		}
		
		closeDriver();
	}
}


