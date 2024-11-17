package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownSearch {

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
	}

	@AfterClass
	public void closeUp() throws Exception {
		Thread.sleep(4000);
		driver.close();
	}

	//@Test(priority = 2)
	public void testDropdownValues() throws Exception {
		String[] expectedCountry = { "India", "Mahesh", "United States", "Japan" };
		
		WebElement country = driver.findElement(By.xpath("//label[text()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView(true)", country);

		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='country']"));

		Select select = new Select(selectCountry);

		List<WebElement> listSelectedOptions = select.getAllSelectedOptions();
		List<WebElement> listAllOptions = select.getOptions();

		for (WebElement options : listSelectedOptions) {
			System.out.println(options.getText());
		}

		for (WebElement options : listAllOptions) {
			System.out.println(options.getText());
		}
		boolean found = false;

		for (int i = 0; i < expectedCountry.length; i++) {
			found = false;
			String currentCountry = expectedCountry[i];
			for (WebElement option : listAllOptions) {
				if (currentCountry.equals(option.getText())) {
					found = true;
					break;
				}
			}
			if (found == true) {
				System.out.println(currentCountry + " is found in country drop down.");
			} else {
				System.out.println(currentCountry + " is not found in country drop down.");
			}
		}

		Thread.sleep(4000);
		driver.close();
	}

}
