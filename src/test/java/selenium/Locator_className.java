package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_className {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.className("orangehrm-login-logo"));
		Boolean str1 = element1.isDisplayed();
		System.out.println(str1);
		
		Thread.sleep(5000);
		driver.close();
	}

}
