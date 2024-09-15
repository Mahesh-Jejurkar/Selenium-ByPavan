package selenium_byPavan;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLinkText {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("HRM")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
