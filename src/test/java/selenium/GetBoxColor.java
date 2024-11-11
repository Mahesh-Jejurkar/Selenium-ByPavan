package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetBoxColor {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement tableCell = driver.findElement(By.xpath("(//table)[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
		//action.moveToElement(tableCell).build().perform();
		Thread.sleep(1000);
		String backgroundColor = tableCell.getCssValue("bgcolor");
		System.out.println(backgroundColor);
		
		
		
		Thread.sleep(7000);
		driver.close();
	}

}
