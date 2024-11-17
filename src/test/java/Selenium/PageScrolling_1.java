package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageScrolling_1 extends BaseClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();

		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		Object y_offset = js.executeScript("return window.pageYOffset");
		System.out.println(y_offset);

		WebElement label_featured = driver.findElement(By.xpath("//h3[text()='Featured']"));
		Thread.sleep(1000);
		// js.executeScript("window.scrollBy(0, 200)");
		js.executeScript("arguments[0].scrollIntoView()", label_featured);
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);

		Object y_offset2 = js.executeScript("return window.pageYOffset");
		System.out.println(y_offset2);
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(1000);
		Object y_offset3 = js.executeScript("return window.pageYOffset");
		System.out.println(y_offset3);
		
		js.executeScript("document.body.style.zoom='80%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='50%'");

		
		closeDriver();
	}

}
