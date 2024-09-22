package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfc.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'product-category-wrap')]")).click();
		Thread.sleep(2000);
		List<WebElement> list_producttype = driver.findElements(By.xpath("//ul[@id='productType']//li"));
		selectOptionsFromDropDown(list_producttype, "Housing Loans");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class, 'product-name-active')]")).click();
		Thread.sleep(2000);
		List<WebElement> list_products = driver.findElements(By.xpath("//ul[@id='productName']//li"));
		selectOptionsFromDropDown(list_products, "Rural Housing Loans");
		
		Thread.sleep(5000);
		driver.close();
	}
	
	public static void selectOptionsFromDropDown(List<WebElement> list_alloptions, String value) {
		for(WebElement products : list_alloptions) {
			if(products.getText().equals(value)) {
				products.click();
				break;
			}
		}
	}

}
