package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		//selectChoiceValues(driver, "choice 2", "choice 2 1", "choice 6 2 3");
		selectChoiceValues(driver,"All");
		driver.findElement(By.xpath("//div[@class='container']")).click();
		
		Thread.sleep(9000);
		driver.close();
	}

	public static void selectChoiceValues(WebDriver driver, String... values) throws Exception {
		List<WebElement> list_options = driver.findElements(By.xpath("//div[@class='col-lg-6'][1]//span[@class='comboTreeItemTitle']"));

		if (!values[0].equalsIgnoreCase("all")) {
			for (WebElement options : list_options) {
				String actualValue = options.getText();
				for (String value : values) {
					if (actualValue.equals(value)) {
						Thread.sleep(500);
						options.click();
						break;
					}
				}
			}
		}
		else {
			for(WebElement option : list_options) {
				Thread.sleep(500);
				option.click();
			}
		}
	}

}
