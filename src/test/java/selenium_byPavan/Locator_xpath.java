package selenium_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mahesh"); 
//		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("iPhone");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
//		System.out.println(driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed());
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'rch')]")).sendKeys("iPhone");
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("MacBook");
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
