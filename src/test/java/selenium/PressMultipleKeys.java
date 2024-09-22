package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class PressMultipleKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
		
		
		driver.get("https://text-compare.com/");
		Thread.sleep(2000);
		
		WebElement comparsonWrapper = driver.findElement(By.xpath("//div[@id='comparisonWrapper']"));
		
		//wait.until(ExpectedConditions.visibilityOf(comparsonWrapper));
		js.executeScript("arguments[0].scrollIntoView()", comparsonWrapper);
		Thread.sleep(2000);
		
		WebElement textarea1	= driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement textarea2	= driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		WebElement button_compare	= driver.findElement(By.xpath("//div[text()='Compare!']"));
		
		String text2 ="Mahesh Jejurkar \n Software Test Engineer";
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam tempor sapien leo, a rutrum lorem dapibus et. Nullam scelerisque ullamcorper lacinia. Aliquam placerat pellentesque venenatis. Donec volutpat consequat purus, vel laoreet risus sodales vitae. Mauris quam urna, feugiat eget purus vel, scelerisque euismod massa. Suspendisse sit amet pulvinar dui, et molestie felis. Proin non ipsum justo. Curabitur mi lacus, interdum eu mollis quis, maximus feugiat nibh. Donec in dolor hendrerit, iaculis augue eget, lacinia tellus. Morbi sollicitudin feugiat convallis. Suspendisse vel rutrum nibh. Sed vehicula, est congue porta semper, nulla libero pretium ex, a ullamcorper urna sapien a felis. Ut tristique ullamcorper diam, sed placerat urna luctus et. Nulla ornare magna vel lectus fringilla dapibus.";
		
		textarea1.sendKeys(text2);
		Thread.sleep(500);
		
		action.keyDown(Keys.CONTROL).keyDown("A").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.CONTROL).keyDown("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(textarea2).keyDown(Keys.CONTROL).keyDown("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		
		if(textarea1.getAttribute("value").equals(textarea2.getAttribute("value"))) {
			System.out.println("Text copied and pasted successfully and are identical...");
		}else {
			System.out.println("Text copy and paste failed and are not identical...");
		}
	
		Thread.sleep(9000);
		driver.close();
	}
}
