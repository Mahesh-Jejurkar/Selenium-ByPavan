package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker_1 extends BaseClass {
	static String dd = "1";
	static String mm = "September";
	static String yyyy = "2024";

	public static void main(String[] args) throws Exception {

		WebDriver driver = getDriver();

		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement input_date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		input_date.click();
		Thread.sleep(1000);

//		input_date.sendKeys("02/24/1990");
//		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

		selectFuturDate();
		//selectPastDate();

		closeDriver();
	}
	

	public static void selectFuturDate() throws Exception {
		while (true) {
			Thread.sleep(500);
			String current_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]"))
					.getText();
			String current_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]"))
					.getText();

			if (current_month.equals(mm) && current_year.equals(yyyy)) {
				break;
			}

			driver.findElement(By.xpath("//a[@title='Prev']")).click();
		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date : allDates) {
			if (date.getText().equals(dd)) {
				date.click();
				break;
			}
		}	
	}
	
	public static void selectPastDate() throws Exception {
		while (true) {
			Thread.sleep(500);
			String current_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]"))
					.getText();
			String current_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]"))
					.getText();

			if (current_month.equals(mm) && current_year.equals(yyyy)) {
				break;
			}

			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date : allDates) {
			if (date.getText().equals(dd)) {
				date.click();
				break;
			}
		}
	}	
}