package selenium_bypavan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment_05 extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement label_colors = driver.findElement(By.xpath("//label[text()='Colors:']"));
		getJS().executeScript("arguments[0].scrollIntoView(true)", label_colors);
		Thread.sleep(2000);
		WebElement txtarea_colors = driver.findElement(By.xpath("//select[@id='colors']"));
		Select selectColors = new Select(txtarea_colors);
		List<WebElement> listColors = selectColors.getOptions();
		System.out.println("No. of colors : "+listColors.size());
		for(WebElement colors : listColors) {
			System.out.println(colors.getText());
		}
		
		selectColors.selectByVisibleText("Red");
		Thread.sleep(1000);
		selectColors.selectByVisibleText("Yellow");
		Thread.sleep(1000);
		selectColors.selectByValue("green");
		Thread.sleep(2000);
		
		List<WebElement> listSelectedColors = selectColors.getAllSelectedOptions();
		System.out.println("No. of selected colors : "+listSelectedColors.size());
		for(WebElement selectedColors : listSelectedColors) {
			System.out.println(selectedColors.getText());
		}
		
		Thread.sleep(2000);
		selectColors.deselectByVisibleText("Green");
		Thread.sleep(2000);
		selectColors.deselectAll();
		
		Thread.sleep(2000);
		selectColors.selectByIndex(1);
		
		closeDriver();
	}
}
