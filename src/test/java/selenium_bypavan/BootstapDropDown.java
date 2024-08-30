package selenium_bypavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstapDropDown extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		//Job Title
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]")).click();
		Thread.sleep(2000);
		List<WebElement> options_job = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("No. of job titles : "+options_job.size());
		for(WebElement jod : options_job) {
			System.out.println(jod.getText());
		}	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Financial Analyst']")).click();
		
		Thread.sleep(5000);
		
		System.out.println();
		//Employment Status
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> options_employment = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("No. of employment status : "+options_employment.size());
		for(WebElement employment : options_employment) {
			System.out.println(employment.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Part-Time Internship']")).click();
		
		
		closeDriver();
		
	}

}
