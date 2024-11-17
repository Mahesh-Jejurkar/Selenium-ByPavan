package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch2 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeUp() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testMethod1() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		search.sendKeys("Selenium");
		List<WebElement> searchedElement = driver.findElements(By.xpath("//ul[@role='listbox']/li//span"));
		Thread.sleep(2000);

		for (WebElement s : searchedElement) {
			Thread.sleep(500);
			String currentText = s.getText();
			if (currentText.equals("selenium webdriver")) {
				s.click();
				break;
			}
		}
	}
}
