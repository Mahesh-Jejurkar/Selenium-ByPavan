package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoteAutomatedMsg {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String [] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.quit();
	}

}
