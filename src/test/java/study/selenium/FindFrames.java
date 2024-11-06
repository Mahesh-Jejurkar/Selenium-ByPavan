package study.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindFrames {
	
	@Test
	public void getFrameName() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		for(WebElement  frame : frames) {
			String frameName = frame.getAttribute("name");
			System.out.println(frameName);
		}
	}

}
