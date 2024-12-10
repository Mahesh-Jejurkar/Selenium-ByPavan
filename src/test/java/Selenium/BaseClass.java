package Selenium;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class BaseClass
{	
	public static WebDriver driver;
	public static ChromeOptions options;
	public static Wait<WebDriver> myFluentWait;
	public static Actions action;
	public static JavascriptExecutor js;

	public static WebDriver getDriver() throws Exception 
	{
//		File crx_selectorshub = new File (System.getProperty("user.dir")+"\\input-files\\SelectorsHub.crx");
//		File crx_addblocker = new File (System.getProperty("user.dir")+"\\input-files\\AdBlocker.crx");
//		List<File> crxfiles = new ArrayList<File>();
//		crxfiles.add(crx_addblocker);
//		crxfiles.add(crx_selectorshub);
		
		options = new ChromeOptions();
//		options.addArguments("--headless=new");
//		options.addArguments("--incognito");
//		options.addExtensions(crx_selectorhub);
//		options.addExtensions(crx_addblocker);
//		options.addExtensions(crxfiles); 
		//Disable automated notification bar
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriverWait myExplicitWait() 
	{
		WebDriverWait myExplicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return myExplicitWait;
	}
	
	public static Wait<WebDriver> myFluentWait() 
	{
		myFluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		return myFluentWait; 
	}
	
	public static JavascriptExecutor getJavascriptExecutor() 
	{
		js = (JavascriptExecutor) driver;
		return js;
	}
	
	public static Actions getActions() 
	{
		action = new Actions(driver);
		return action;
	}

	public static void closeDriver() throws Exception 
	{
		Thread.sleep(9000);
		driver.quit();
	}
	
	public static String getDateTime() 
	{
		LocalDateTime currentDate = LocalDateTime.now();
		DateTimeFormatter expectedFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		String dateTime = currentDate.format(expectedFormat);
		return dateTime;
	}
	
	public static void changeColor(WebDriver driver , WebElement element) throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 255, 0, 1)'", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 0, 0, 0)'", element);
	}
}
