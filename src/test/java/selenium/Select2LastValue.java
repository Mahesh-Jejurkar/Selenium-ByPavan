package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Select2LastValue {
	 	
	@Test
	public void select2LastValue() throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drp_country = driver.findElement(By.id("country"));
		js.executeScript("arguments[0].scrollIntoView()", drp_country);
		
		Select select_country = new Select(drp_country);
		int size = select_country.getOptions().size();
		System.out.println(size);
		select_country.selectByIndex(size-2);
		
		Thread.sleep(9000);
		driver.close();
	}
	
}
