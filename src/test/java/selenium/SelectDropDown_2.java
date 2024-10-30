package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_2 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		Boolean CountryFound = false;
		
		String[] expectedCountry = {"Canada", "Bharat","Japan", "India", "Mahesh"};
		
		WebElement  dropdown_country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select_country = new Select(dropdown_country);
		
		List<WebElement> listCountry = select_country.getOptions();
			
		
		for( int i=0; i<expectedCountry.length; i++) {
			CountryFound = false;
			 String currentCountry = expectedCountry[i];
			 for(int j=0; j<listCountry.size(); j++) {
				 if(currentCountry.equals(listCountry.get(j).getText().toString())) {
					CountryFound = true;
					break;
				 }
			 }
			 
			 if(CountryFound==true) {
				 System.out.println(currentCountry+" is found.");
			 }else {
				 System.out.println(currentCountry+" is not found.");
			 }
		}
	}

}
