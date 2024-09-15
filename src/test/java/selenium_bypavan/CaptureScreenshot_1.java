package selenium_bypavan;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaptureScreenshot_1 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Full page screenshot
		File screenshot_fullpage = takesscreenshot.getScreenshotAs(OutputType.FILE);
		File filepath1 = new File(System.getProperty("user.dir")+"\\screenshot\\screen1.jpg");
		FileUtils.copyFile(screenshot_fullpage, filepath1);
		
		
		//Capture screenshot of webelement
		Thread.sleep(2000);
		WebElement buttton_cart	= driver.findElement(By.xpath("//div[@id='cart']"));
		File screenshot_cartbutton = buttton_cart.getScreenshotAs(OutputType.FILE);
		File filepath3 = new File (System.getProperty("user.dir")+"\\screenshot\\cartbutton.jpg");
		FileUtils.copyFile(screenshot_cartbutton, filepath3);
		
		
		
		//Capture screenshot of specific section
		Thread.sleep(2000);
		WebElement div_featureprodct =	driver.findElement(By.xpath("//div[@id='content']/div[2]"));
		js.executeScript("arguments[0].scrollIntoView()", div_featureprodct);
		Thread.sleep(1000);
		File screenshot_featuredproduct	= div_featureprodct.getScreenshotAs(OutputType.FILE);
		File filepath2 = new File(System.getProperty("user.dir")+"\\screenshot\\featuredproduct1.jpg");
		FileUtils.copyFile(screenshot_featuredproduct, filepath2);
		
		
		
		closeDriver();
	}
}
