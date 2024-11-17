package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickOnImage extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=amazon");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@title='Amazon']")).click();
//		driver.findElement(By.cssSelector("img[title='Amazon']")).click();
		
		closeDriver();
	}
}