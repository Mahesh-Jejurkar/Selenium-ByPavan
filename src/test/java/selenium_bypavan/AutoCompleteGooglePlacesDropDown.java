package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteGooglePlacesDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		searchbox.sendKeys("Toronto");
		Thread.sleep(2000);
		
		String text;
		
		do {
			searchbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			text = searchbox.getAttribute("value");
			Thread.sleep(1000);
			if(text.equals("Toronto, OH, USA")) {
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
		}while(!text.isEmpty());
	
		
		Thread.sleep(9000);
		driver.close();
	}
}
