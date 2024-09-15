package selenium_bypavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
