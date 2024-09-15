package selenium_bypavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_1 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement  dropdown_country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select_country = new Select(dropdown_country);
		List<WebElement> listCountry = select_country.getOptions();
		for( WebElement country : listCountry) {
			System.out.println(country.getText());
		}
		
		Thread.sleep(2000);
		WebElement firstSelectedOption = select_country.getFirstSelectedOption();
		System.out.println("First selected option : "+firstSelectedOption.getText());
		
		Thread.sleep(2000);
		select_country.selectByVisibleText("India");
		Thread.sleep(2000);
		select_country.selectByValue("japan");
		Thread.sleep(2000);
		select_country.selectByIndex(2);
		Thread.sleep(2000);
	}

}
