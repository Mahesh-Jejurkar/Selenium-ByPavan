package selenium_byPavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL{

	public static void main(String[] args) throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true); //Accept SSL certificate.
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}