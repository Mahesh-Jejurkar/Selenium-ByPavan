package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_1 extends BaseClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = getDriver();
		Actions action = getActions();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = driver.findElement(By.id("box106"));
		action.dragAndDrop(rome, italy).build().perform();
		Thread.sleep(1000);
		
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement sweden = driver.findElement(By.id("box102"));
		action.dragAndDrop(stockholm, sweden).build().perform();
		
		closeDriver();

	}
}
