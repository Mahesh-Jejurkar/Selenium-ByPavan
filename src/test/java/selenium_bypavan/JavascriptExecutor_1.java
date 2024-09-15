package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutor_1 extends BaseClass {

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement input_name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement input_email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement input_phone = driver.findElement(By.xpath("//input[@id='phone']"));
		WebElement input_area = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		
		js.executeScript("arguments[0].setAttribute('value','Mahesh')", input_name);
		Thread.sleep(500);
		js.executeScript("arguments[0].value='Jeje'", input_email);
		Thread.sleep(500);
		js.executeScript("arguments[0].value=arguments[1]", input_phone, "1234567890");
		Thread.sleep(500);
		js.executeScript("arguments[0].value=arguments[1]", input_area, "Main raod \n Ojas City");
		Thread.sleep(1000);
		
		String value = (String) js.executeScript("return arguments[0].value", input_name);
		System.out.println(value);
		
		WebElement label_gender = driver.findElement(By.xpath("//label[text()='Gender:']"));
		js.executeScript("arguments[0].scrollIntoView(true)", label_gender);
		
		Thread.sleep(2000);
		WebElement radio_male =	driver.findElement(By.xpath("//input[@id='male' and @type='radio']"));
		js.executeScript("arguments[0].click()", radio_male);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		
		closeDriver();
	}

}
