package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.co.in/");
		By locator_searchbox = By.name("q");
		WebElement searchbox = waitForElementTobeVisible(driver, locator_searchbox);
		searchbox.sendKeys("Selenium");
		searchbox.sendKeys(Keys.ENTER);
		
		By locator_selenium = By.xpath("//span[text()='Selenium']");
		WebElement selenium = waitForElementTobeVisible(driver, locator_selenium);
		selenium.click();
		
		Thread.sleep(5000);
		driver.close();

	}
	
	
	public static WebElement waitForElementTobeVisible(WebDriver driver, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Exception.class);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}

}
