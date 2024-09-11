package selenium_bypavan;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewTab2 {

	public static void main(String[] args) throws Exception {
		String combinedactionkeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
		Thread.sleep(5000);
		
		WebElement register = driver.findElement(By.xpath("(//a[text()='Register'])[2]"));
		register.sendKeys(combinedactionkeys);
		Thread.sleep(2000);
		
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String	parentwindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		System.out.println("Child window title: "+driver.getTitle());
		
		Thread.sleep(9000);
		
		driver.switchTo().window(parentwindow);
		System.out.println("Parent window title: "+driver.getTitle());
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
