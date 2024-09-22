package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment_08 extends BaseClass{

	public static void main(String[] args) throws Exception{
		String from_location = "Del";
		String to_location = "Rod";
		
		WebDriver driver = getDriver();
		driver.get("https://dummy-tickets.com/buyticket");
		Thread.sleep(2000);
		WebElement input_from = driver.findElement(By.xpath("//div[@id='onewaymain']//div[1]/div[1]/input"));
		WebElement input_to = driver.findElement(By.xpath("//div[@id='onewaymain']//div[1]/div[2]/input"));
		
		Thread.sleep(500);
		input_from.sendKeys(from_location);
		Thread.sleep(1000);
		List<WebElement> list_from = driver.findElements(By.xpath("//div[@id='onewaymain']//div[1]/div[1]/ul//p"));
		for(WebElement from : list_from) {
			if(from.getText().contains(from_location)) {
				from.click();
				break;
			}else {
				from.click();
				break;
			}
		}
		
		Thread.sleep(500);
		input_to.sendKeys(to_location);
		Thread.sleep(500);
		List<WebElement> list_to = driver.findElements(By.xpath("//div[@id='onewaymain']//div[1]/div[2]/ul//p"));
		for(WebElement to : list_to) {
			if(to.getText().contains(to_location)) {
				to.click();
				break;
			}else {
				to.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='onewaymain']//div[2]/div[1]/input")).click();
		Thread.sleep(500);
		WebElement dp_year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select select_year = new Select(dp_year);
		select_year.selectByVisibleText("2025");
		
		Thread.sleep(1000);
		WebElement dp_month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select select_month = new Select(dp_month);
		select_month.selectByVisibleText("Feb");
		
		Thread.sleep(1000);
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement date : allDates) {
			if(date.getText().equals("24")) {
				date.click();
				break;
			}
		}
		
		closeDriver();
	}
}