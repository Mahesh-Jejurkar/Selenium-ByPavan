package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
		String tooltiptext = inputbox.getAttribute("title");
		System.out.println(tooltiptext);
		
		Thread.sleep(9000);
		driver.close();
	}

}
