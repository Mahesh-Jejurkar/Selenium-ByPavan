package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_cssSelector {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		
		/*
		 * //tag#id driver.findElement(By.cssSelector("form#form-currency")).click();
		 * Thread.sleep(2000); //tag.class
		 * 
		 * //tag[attribute='value']
		 * driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Iphone")
		 * ;
		 */
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		
		
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
