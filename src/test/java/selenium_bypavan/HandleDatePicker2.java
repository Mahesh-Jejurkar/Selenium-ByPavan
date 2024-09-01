package selenium_bypavan;

import java.util.HashMap;
import java.util.List;
import java.time.Month;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDatePicker2 extends BaseClass{

	public static void main(String[] args) throws Exception{
		String year = "2024";
		String month = "February";
		String day = "24";
		
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(frame);
		
		WebElement icon_calendar = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
		js.executeScript("arguments[0].scrollIntoView()", icon_calendar);
		icon_calendar.click();
		Thread.sleep(500);
		
		WebElement dropdown_year =driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select_year = new Select(dropdown_year);
		select_year.selectByVisibleText(year);
		Thread.sleep(500);
		
		while(true) {
			String display_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			Month expectedMonth	= convertMonthToObject(month);
			Month currentMonth = convertMonthToObject(display_month);
			
			int compare_result = expectedMonth.compareTo(currentMonth);
			
			if(compare_result < 0) {
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
			else if(compare_result > 0) {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}else {
				break;
			}	
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement dd : allDates) {
			String date = dd.getText();
			if(date.equals(day)) {
				dd.click();
				break;
			}
		}
		
		closeDriver();
	}
	
	static Month convertMonthToObject(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month month_object = monthMap.get(month);
		
		if(month_object==null) {
			System.out.println("Invalid month...");
		}
		return month_object;
	}
}