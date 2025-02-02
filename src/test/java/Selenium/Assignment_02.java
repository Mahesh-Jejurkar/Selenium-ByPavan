package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment_02 extends BaseClass 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(1000);
		List<WebElement> radio_listColor = driver.findElements(
				By.xpath("//div[contains(text(),'favorite color')]//parent::div//div[@class='form-check']/input"));
		for (WebElement color : radio_listColor) 
		{
			Thread.sleep(1000);
			if (color.isEnabled() == true) 
			{
				color.click();
			} 
			else 
			{
				js.executeScript("arguments[0].removeAttribute('disabled')", color);
				Thread.sleep(2000);
				color.click();
			}
		}

		List<WebElement> radio_listSport = driver.findElements(
				By.xpath("//div[contains(text(),'favorite sport')]//parent::div//div[@class='form-check']/input"));
		for (WebElement sport : radio_listSport) 
		{
			Thread.sleep(1000);
			if (sport.isEnabled() == true) 
			{
				sport.click();
			}
		}
		closeDriver();
	}
}
