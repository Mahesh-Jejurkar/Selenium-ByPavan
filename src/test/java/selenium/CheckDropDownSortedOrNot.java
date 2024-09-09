package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSortedOrNot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement label_country = driver.findElement(By.xpath("//label[text()='Country:']"));
		js.executeScript("arguments[0].scrollIntoView()", label_country);
		WebElement drp_country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select_country = new Select(drp_country);
		List<WebElement> country_options = select_country.getOptions();
		
		ArrayList<String> country_name = new ArrayList<>();
		ArrayList<String> temp_list = new ArrayList<>();
		
		for (WebElement cname : country_options) {
			country_name.add(cname.getText());
			temp_list.add(cname.getText());
		}
		
		System.out.println("Original List: "+country_name);
		Collections.sort(temp_list);
		System.out.println("Sorted List: "+temp_list);
		Thread.sleep(2000);
		
		if(country_name.equals(temp_list)) {
			System.out.println("Dropdown are sorted...");
		}else {
			System.out.println("Dropdown are not sorted...");
		}
		 
		
		Thread.sleep(9000);
		driver.close();
	}
}
