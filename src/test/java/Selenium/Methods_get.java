package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Methods_get extends BaseClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String handle =	driver.getWindowHandle();
		System.out.println(handle);
		
		Boolean status = driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed();
		System.out.println(status);
		
		Boolean status2 = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println(status2);
		
		Thread.sleep(1000);
		
		WebElement we_country = driver.findElement(By.xpath("//label[normalize-space()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", we_country);
		
		WebElement chk_male = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println(chk_male.isSelected());
		Thread.sleep(1000);
		chk_male.click();
		System.out.println(chk_male.isSelected());		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		List<String> handlesList = new ArrayList<String>(handles);
		String parentWindow = handlesList.get(0);
		String childWindow = handlesList.get(1);
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		System.out.println(driver.getTitle()); //Print parent window id.
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle()); //Print child window id.
	
//		for(String hs : handles) {
//			String actualTitle = driver.switchTo().window(hs).getTitle();
//			String expectedTitle = "Your Store";
//			if(actualTitle.equals(expectedTitle)) {
//				driver.close();
//			}
//		}
//	
		closeDriver();
	}
}