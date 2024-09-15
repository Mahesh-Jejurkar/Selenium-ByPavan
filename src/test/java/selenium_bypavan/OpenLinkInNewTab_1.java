package selenium_bypavan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab_1 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		
		Actions act = new Actions(driver);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement link_hrm = driver.findElement(By.xpath("//a[text()='orange HRM']"));
		js.executeScript("arguments[0].scrollIntoView(true)", link_hrm);
		Thread.sleep(1000);
		
		//act.keyDown(Keys.CONTROL).moveToElement(link_hrm).click().keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).click(link_hrm).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> itr_handles = handles.iterator();
		while(itr_handles.hasNext()) {
			String currentHandle = itr_handles.next();
			driver.switchTo().window(currentHandle);
			String title = driver.getTitle();
			if(title.equals("OrangeHRM")) {
				break;
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		closeDriver();
	}
}
