package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextboxValue {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
		input_username.sendKeys("Mahesh");
		Thread.sleep(5000);
		String textbox_value = input_username.getAttribute("value");
		System.out.println(textbox_value);
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
