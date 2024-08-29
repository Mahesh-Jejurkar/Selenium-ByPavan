package selenium_bypavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment_07 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		Actions act = getActions();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		List<WebElement> sourceItems = driver.findElements(By.xpath("//div[@id='products']//ul//li"));
		int sourceItemsCount = sourceItems.size();
		
		List<WebElement> targetItems = driver.findElements(By.xpath("//div[@class='span12']//div[1]/table//table//ol"));
		int targetItemsCount = targetItems.size();
		
		for(int s=0; s<sourceItemsCount; s++) {
			for(int t=0; t<targetItemsCount; t++) {
				act.dragAndDrop(sourceItems.get(s), targetItems.get(t)).build().perform();
				Thread.sleep(1000);
			}
		}
		closeDriver();
	}
}
