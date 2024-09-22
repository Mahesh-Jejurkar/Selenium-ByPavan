package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_3 {

	public static void main(String[] args) throws Exception {
		String date = "15";
		String month = "September";
		String year = "2026";

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(500);

		while (true) {
			Thread.sleep(300);
			String current_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
			String current_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
			
			if (current_year.equals(year) && current_month.equals(month)) {
				break;
			}
			//Click on next button
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement d : alldates) {
			String current_date = d.getText();
			if(current_date.equals(date)) {
				d.click();
				break;
			}
		}

	Thread.sleep(10000);
	driver.close();
	}
}
