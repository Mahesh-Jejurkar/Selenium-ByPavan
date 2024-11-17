package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_1{

	public static void main(String[] args) throws Exception{
//		WebDriver driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = driver;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement input_name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement input_email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement input_phone = driver.findElement(By.xpath("//input[@id='phone']"));
		WebElement input_area = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		
		//Set value of an Input Field
		js.executeScript("arguments[0].setAttribute('value','Mahesh')", input_name);
		Thread.sleep(500);
		js.executeScript("arguments[0].value='Jeje'", input_email);
		Thread.sleep(500);
		js.executeScript("arguments[0].value=arguments[1]", input_phone, "1234567890");
		Thread.sleep(500);
		js.executeScript("arguments[0].value=arguments[1]", input_area, "Main raod \n Ojas City");
		Thread.sleep(1000);
		
		//Get the value of an Input Field
		String value = (String) js.executeScript("return arguments[0].value", input_name);
		System.out.println(value);
		
		//Scroll to an Element
		WebElement label_gender = driver.findElement(By.xpath("//label[text()='Gender:']"));
		js.executeScript("arguments[0].scrollIntoView()", label_gender);
		Thread.sleep(2000);
		
		//Click an Element
		WebElement radio_male =	driver.findElement(By.xpath("//input[@id='male' and @type='radio']"));
		js.executeScript("arguments[0].click()", radio_male);
		Thread.sleep(2000);
		
		//Scroll to the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Scroll to the top of the page
		js.executeScript("window.scrollTo(0,0)");
		
		Thread.sleep(5000);
		driver.close();
	}

}
