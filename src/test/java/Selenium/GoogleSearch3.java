package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch3 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Infosys");

		List<WebElement> webelement_names = driver.findElements(By.xpath("//ul[@role='listbox']/li//span"));

		for (WebElement name : webelement_names) 
		{
			System.out.println(name.getText());
		}

		for (WebElement name : webelement_names) 
		{
			String curretText = name.getText();
			if (curretText.equalsIgnoreCase("infosys careers")) 
			{
				name.click();
				break;
			}
		}

		Thread.sleep(8000);
		driver.close();
	}
}

