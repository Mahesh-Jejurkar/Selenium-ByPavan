package selenium_bypavan;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		Thread.sleep(2000);
		
		// Flash an element
		WebElement link_login = driver.findElement(By.xpath("//div[contains(@class, 'navbar-right')] //a[text()='Register']"));
		JavascriptUtilities.flashElement(driver, link_login);

		// Getting title of page
		String page_title = JavascriptUtilities.getTitle(driver);
		System.out.println(page_title);

		// Generate alert
		JavascriptUtilities.generateAlert(driver, "Opencart loaded...");
		Thread.sleep(1000);
		JavascriptUtilities.acceptAlert(driver);
		JavascriptUtilities.takeScreenshot(driver, "Page_Home");
		
		// Scroll down and scroll up and scroll to element
		WebElement image_showcase = driver.findElement(By.xpath("//img[contains(@src,'shop-showcase')]"));
		JavascriptUtilities.scrollToElement(driver, image_showcase);
		Thread.sleep(2000);
		JavascriptUtilities.scrollDownToBottom(driver);
		Thread.sleep(2000);
		JavascriptUtilities.scrollUpToTop(driver);

		// Drawing border around element
		WebElement image_logo = driver.findElement(By.xpath("//a[@class='navbar-brand']//img"));
		JavascriptUtilities.drawBorder(driver, image_logo);
		Thread.sleep(1000);
		JavascriptUtilities.takeScreenshot(driver, "Page_Home");

		// Click element
		WebElement link_features = driver
				.findElement(By.xpath("//div[@id='navbar-collapse-header']//a[text()='Features']"));
		JavascriptUtilities.clickElement(driver, link_features);
		Thread.sleep(1000);
		String page_tile2 = JavascriptUtilities.getTitle(driver);
		System.out.println(page_tile2);
		JavascriptUtilities.takeScreenshot(driver, "Page_Feature");

		// Refresh the page
		Thread.sleep(2000);
		JavascriptUtilities.refreshPage(driver);

		// Zoom page
		Thread.sleep(2000);
		JavascriptUtilities.zoomPage(driver, "50%");
		Thread.sleep(2000);
		JavascriptUtilities.zoomPage(driver, "90%");

		Thread.sleep(7000);
		driver.close();
	}

}

class JavascriptUtilities {

	public static String getDateTime() {
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		String dateTime = currentDate.format(expectedFormat);
		return "-" + dateTime;
	}

	public static void takeScreenshot(WebDriver driver, String name) throws Exception {
		String filename = name + getDateTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File storeAt = new File(".\\screenshot\\" + filename + ".jpg");
		FileUtils.copyFile(screenshot, storeAt);
	}

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static String getTitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		return title;
	}

	public static void clickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void refreshPage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void scrollDownToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollUpToTop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void zoomPage(WebDriver driver, String zoomPercentage) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='"+zoomPercentage+"'");
	}
	
	public static void flashElement(WebDriver driver, WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String background_color = element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			js.executeScript("arguments[0].style.backgroundColor='#006400'", element);
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.backgroundColor='"+background_color+"'", element);
			Thread.sleep(1000);
		}
		
	}
	
}
