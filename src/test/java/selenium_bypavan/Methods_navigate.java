package selenium_bypavan;

import java.net.URL;

import org.openqa.selenium.WebDriver;

public class Methods_navigate extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		
	    URL url = new URL("https://demo.opencart.com/");
		
		driver.get("https://testautomationpractice.blogspot.com/");	//Accept only string as parameter.
		Thread.sleep(3000);
		driver.navigate().to(url);			//Accept String or URL as parameter.
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		
		
		closeDriver();
	}
}
