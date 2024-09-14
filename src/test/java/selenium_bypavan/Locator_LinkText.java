package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkText {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("open cart")).click();
		
		Thread.sleep(9000);
		driver.close();
	}

}
