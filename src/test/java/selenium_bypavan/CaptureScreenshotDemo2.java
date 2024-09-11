package selenium_bypavan;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaptureScreenshotDemo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		//Full page screenshot
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File tgt = new File(".\\screenshot\\homescreen.jpg");
		FileUtils.copyFile(src, tgt);
		Thread.sleep(2000);
		
		//Screenshot of element
		WebElement div_wikipedia = driver.findElement(By.xpath("//div[@id='Wikipedia1']"));
		File src2 = div_wikipedia.getScreenshotAs(OutputType.FILE);
		File tgt2 = new File(".\\screenshot\\wikipedia.jpg");
		FileUtils.copyFile(src2, tgt2);
		
		
		driver.close();
	}

}
