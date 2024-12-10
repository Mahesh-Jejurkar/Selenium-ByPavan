package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MouseActions_1 extends BaseClass 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = getDriver();
		Actions action = getActions();
		
		//MoveToElement and Click
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		WebElement menu_desktop = driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[1]/a"));
		WebElement menu_mac = driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[1]//li[2]/a"));
		
		action.moveToElement(menu_desktop).moveToElement(menu_mac).click().build().perform();
		Thread.sleep(5000);

		//Context Click / Right Click
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightClickMe).build().perform();
		Thread.sleep(500); 
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

		
		//Double Click
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		
		WebElement input_field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement input_field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button_copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		String inputText = "Mahesh";
		String textOfField1 = null;
		String textOfField2 = null;

		input_field1.clear();
		Thread.sleep(500);
		input_field1.sendKeys(inputText);
		Thread.sleep(500);
		action.doubleClick(button_copytext).build().perform();
		Thread.sleep(500);
		textOfField1 = input_field1.getAttribute("value");
		textOfField2 = input_field2.getAttribute("value");
		
		if(textOfField2.equals(textOfField1)) 
		{
			System.out.println(" Text are equal. \n Test passed...");
			Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("Text are not equal. \n Test failed...");
			Assert.assertTrue(false);
		}

		closeDriver();
	}
}
