package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTable2 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.xpath("//div[@class='orangehrm-container']"));
		getJS().executeScript("arguments[0].scrollIntoView(true);", table);
		
		int rowCount = driver.findElements(By.xpath("//div[@class='oxd-table']/div[2]/div")).size();
		System.out.println("Total no. of records : "+rowCount);
		
		for(int r=1; r<=rowCount; r++) {
			Thread.sleep(1000);
			String username	= driver.findElement(By.xpath("//div[@class='oxd-table']/div[2]/div["+r+"]/div/div[2]/div")).getText();
			String name = driver.findElement(By.xpath("//div[@class='oxd-table']/div[2]/div["+r+"]/div/div[4]/div")).getText();
			String role = driver.findElement(By.xpath("//div[@class='oxd-table']/div[2]/div["+r+"]/div/div[3]/div")).getText();
			System.out.println(username+"\t"+name+"\t"+role);
		}
		
		
		
	}
}
