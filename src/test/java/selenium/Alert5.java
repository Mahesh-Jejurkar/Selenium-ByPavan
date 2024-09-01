package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);

		String Xpath_AlertWithTexbox = "//*[contains(text(), 'Alert with Textbox')]";
		String Xpath_Promptbox = "//*[contains(text(), 'prompt box')]";
		String Xpath_text = "//*[contains(@id, 'demo1')]";
		String inputText = "Mahesh";
		String expectedText = "Hello " + inputText + " How are you today";
		String actualText = null;
		String resultText = "Test Passed...";
		int i = 0;

		driver.findElement(By.xpath(Xpath_AlertWithTexbox)).click();

		do {
			driver.findElement(By.xpath(Xpath_Promptbox)).click();
			Thread.sleep(1000);
			driver.switchTo().alert().sendKeys("");
			Thread.sleep(2000);
			driver.switchTo().alert().sendKeys(inputText);
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			i++;
		} while (i != 5);

		actualText = driver.findElement(By.xpath(Xpath_text)).getText();
		System.out.println("  Actual Text : " + actualText);
		System.out.println("Expected Text : " + expectedText);

		if (actualText.equals(expectedText)) {
			System.out.println(resultText);
		}

		Thread.sleep(5000);
		driver.quit();

	}
}