package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='textbox']")).sendKeys("Testing file...");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='createTxt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='link-to-download']")).click();

		Thread.sleep(2000);
		driver.close();
	}
}