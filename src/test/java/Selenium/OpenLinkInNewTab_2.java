package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab_2 {

	public static void main(String[] args) throws Exception {
		String combinedactionkeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		Thread.sleep(5000);
		
		WebElement register = driver.findElement(By.xpath("(//a[text()='Register'])[2]"));
		//register.sendKeys(combinedactionkeys);
		action.clickAndHold(register).keyDown(Keys.CONTROL).keyDown(Keys.ENTER).keyUp(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String	parentwindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		System.out.println("Switched to child window. \n Title: "+driver.getTitle());
		
		Thread.sleep(9000);
		
		driver.switchTo().window(parentwindow);
		System.out.println("\nSwitched parent window. \n Title: "+driver.getTitle());
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
