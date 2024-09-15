package selenium_byPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_id {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Mahesh Jeje");
		driver.findElement(By.id("email")).sendKeys("mahesh.jeje@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("12345692");
		driver.findElement(By.id("textarea")).sendKeys("Main Road \n Wow City \n Woka woka country");
		driver.findElement(By.id("male")).click();
		
		
		
		Thread.sleep(6000);
		driver.close();
	}

}
