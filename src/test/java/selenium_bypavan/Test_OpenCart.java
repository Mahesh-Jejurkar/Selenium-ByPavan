package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test_OpenCart extends BaseClass{

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[text()='My Account'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Register'])")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//		WebElement btn_continue = myExplicitWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));
		WebElement btn_continue = myFluentWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']")));
		btn_continue.click();
		
		closeDriver();
	}
}
