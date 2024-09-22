package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_2 extends BaseClass{

	public static void main(String[] args) throws Exception{
		String text_input = "Lorem ipsum odor amet, consectetuer adipiscing elit. Ridiculus hac tortor fames eros facilisis? Condimentum ullamcorper nullam blandit cursus; curae morbi odio. Interdum himenaeos placerat quis tempor proin. Aliquet ultrices ligula etiam vivamus mattis conubia platea velit. Maecenas elit risus blandit convallis, mus integer conubia posuere. Sociosqu ultricies odio diam praesent montes tincidunt netus elementum. Mus dictum donec fringilla vestibulum ad."; 
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		Actions act = getActions();
		
		driver.get("https://text-compare.com/");
		Thread.sleep(2000);
		WebElement compare = driver.findElement(By.xpath("//div[text()='Compare!']"));
		js.executeScript("arguments[0].scrollIntoView(true);", compare);
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputText1")).sendKeys(text_input);
		Thread.sleep(2000);
		
		//Ctrl + A => Select the text.
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//Ctrl + C	=> Copy the text into clipboard.
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//TAB	=> Shift the second box
		//act.sendKeys(Keys.TAB).build().perform();		OR
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		//Ctrl + V	=> Paste the text from clipboard.
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		closeDriver();

	}
}
