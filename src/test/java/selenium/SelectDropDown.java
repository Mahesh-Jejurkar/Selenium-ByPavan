package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement label_country = driver.findElement(By.xpath("//label[text()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView()", label_country);
		Thread.sleep(2000);
		WebElement 	dropdown_country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select_country = new Select(dropdown_country);
		select_country.selectByVisibleText("India");
		Thread.sleep(2000);
		select_country.selectByIndex(0);
		Thread.sleep(2000);
		select_country.selectByValue("japan");
		Thread.sleep(2000);
		List<WebElement> alloptions = select_country.getOptions();
		for(WebElement options : alloptions) {
			if(options.getText().equals("France")) {
				options.click();
				break;
			}
		}
				
		Thread.sleep(5000);
		driver.close();
	}

}
