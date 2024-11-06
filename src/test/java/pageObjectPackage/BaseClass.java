package pageObjectPackage;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	LoginPage loginpage;
	JavascriptExecutor js;
	Actions action;
	Select select;
	Logger logger;
		
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage = new LoginPage(driver);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
		logger = LogManager.getLogger(this.getClass());
		
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(9000);
		driver.quit();
	}
	
	
	public void clickThroghAction(WebElement element) {
		action.moveToElement(element).click(element).build().perform();
	}
	
	public void javaScriptClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public Select select(WebElement element) {
		select = new Select(element);
		return select;
	}
	
	public void mouseOver(WebElement element) {
		action.moveToElement(element).build().perform();
	}
	
	public void rightClick(WebElement element) {
		action.contextClick(element).build().perform();
	}
	
	public void doubleClick(WebElement element) {
		action.doubleClick(element).build().perform();
	}
	
	public void scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void moveToElement(WebElement element) {
		action.moveToElement(element);
	}
	
	public void clickOnElement(WebElement element) {
		action.click(element);
	}
	
	public void clickAndHold(WebElement element) {
		action.clickAndHold(element);
	}

	public void release(WebElement element) {
		action.release(element);
	}
	
	public Actions dragAndDrop(WebElement element1, WebElement element2) {
		return action.dragAndDrop(element1, element2);
	}
}
