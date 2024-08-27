package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class BaseClass{
	
	public static WebDriver driver;
	public static Wait<WebDriver> myFluentWait;

	public static WebDriver getDriver() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriverWait myExplicitWait() {
		WebDriverWait myExplicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return myExplicitWait;
	}
	
	public static Wait<WebDriver> myFluentWait() {
		myFluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		return myFluentWait; 
	}
	
	public static JavascriptExecutor getJS() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void closeDriver() throws Exception {
		Thread.sleep(9000);
		driver.quit();
	}
}
