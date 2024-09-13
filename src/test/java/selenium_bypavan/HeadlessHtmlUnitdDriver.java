package selenium_bypavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHtmlUnitdDriver {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(50000);
		driver.close();
	}
}
