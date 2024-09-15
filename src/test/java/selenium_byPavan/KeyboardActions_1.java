package selenium_byPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Thread.sleep(2000);
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='target']"));
		
		action.moveToElement(inputbox).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		action.moveToElement(inputbox).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		action.moveToElement(inputbox).sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(3000);
		action.moveToElement(inputbox).sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
