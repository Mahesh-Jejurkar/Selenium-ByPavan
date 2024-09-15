package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//div[@class='orangehrm-container']"));
		js.executeScript("arguments[0].scrollIntoView()", table);
		
		int noOfRows = driver.findElements(By.xpath("//div[@class='orangehrm-container']//div[@role='row']")).size();
		System.out.println(noOfRows);
		
		for(int r=1; r<=noOfRows; r++) {
			String username = driver.findElement(By.xpath("//div[@class='orangehrm-container']//div[@class='oxd-table-body']/div["+r+"]/div/div[2]")).getText();
			String status = driver.findElement(By.xpath("//div[@class='orangehrm-container']//div[@class='oxd-table-body']/div["+r+"]/div/div[5]")).getText();
			
			System.out.println(username+"\t"+status);
		}
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
