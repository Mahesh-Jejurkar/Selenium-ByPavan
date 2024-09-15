package selenium_bypavan;

import java.io.File;
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
		
		// Generate alert
		JavascriptUtilities.generateAlert(driver, "Opencart loaded...");
		Thread.sleep(1000);
		JavascriptUtilities.acceptAlert(driver);
		JavascriptUtilities.takeScreenshot(driver, "Page_Home");
		
		// Getting title of page
		String page_title = JavascriptUtilities.getTitle(driver);
		System.out.println(page_title);
		
		// Drawing border around element
		WebElement image_logo = driver.findElement(By.xpath("//a[@class='navbar-brand']//img"));
		JavascriptUtilities.drawBorder(driver, image_logo);
		Thread.sleep(1000);
		JavascriptUtilities.takeScreenshot(driver, "Page_Home");

		// Flash an element
		WebElement link_login = driver
				.findElement(By.xpath("//div[contains(@class, 'navbar-right')] //a[text()='Register']"));
		JavascriptUtilities.flashElement(driver, link_login);

		// Scroll down and scroll up and scroll to element
		WebElement image_showcase = driver.findElement(By.xpath("//img[contains(@src,'shop-showcase')]"));
		JavascriptUtilities.scrollToElement(driver, image_showcase);
		Thread.sleep(2000);
		JavascriptUtilities.scrollToBottom(driver);
		Thread.sleep(2000);
		JavascriptUtilities.scrollToTop(driver);

		// Click element
		WebElement link_features = driver
				.findElement(By.xpath("//div[@id='navbar-collapse-header']//a[text()='Features']"));
		JavascriptUtilities.clickElement(driver, link_features);
		Thread.sleep(1000);
		String page_tile2 = JavascriptUtilities.getTitle(driver);
		System.out.println(page_tile2);
		JavascriptUtilities.takeScreenshot(driver, "Page_Feature");
		Thread.sleep(2000);
		
		// Scroll the page to height of pixel
		JavascriptUtilities.scrollToPixel(driver, "600");
		Thread.sleep(2000);
		JavascriptUtilities.scrollToTop(driver);
		Thread.sleep(2000);
		
		// Refresh the page
		driver.navigate().back();
		Thread.sleep(2000);
		JavascriptUtilities.refreshPage(driver);
		Thread.sleep(2000);

		// Zoom page
		JavascriptUtilities.zoomPage(driver, "50%");
		Thread.sleep(4000);
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

	public static void flashElement(WebDriver driver, WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String background_color = element.getCssValue("backgroundColor");
		for (int i = 1; i <=5 ; i++) {
			js.executeScript("arguments[0].style.backgroundColor=arguments[1]", element, "#FF0000");
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.backgroundColor=arguments[1]", element, background_color);
			Thread.sleep(1000);
		}
	}

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border=arguments[1]", element, "3px solid red");
	}

	public static String getTitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title").toString();
		return title;
	}

	public static void refreshPage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static void clickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void scrollToPixel(WebDriver driver, String pixel_value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, arguments[0])", pixel_value);
	}

	public static void scrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollToTop(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		//js.executeScript("window.scrollTo(0,0)");
	}

	public static void zoomPage(WebDriver driver, String zoomPercentage) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom=arguments[0]", zoomPercentage);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
}
