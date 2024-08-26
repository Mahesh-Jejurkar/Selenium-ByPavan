package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass{
	
	public static WebDriver driver;

	public static WebDriver getDriver() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
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
