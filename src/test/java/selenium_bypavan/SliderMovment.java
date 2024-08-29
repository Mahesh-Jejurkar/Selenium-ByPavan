package selenium_bypavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMovment extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		Actions act = getActions();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
	}
}
