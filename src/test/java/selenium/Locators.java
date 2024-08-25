package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws Exception {

		// ID, Name, ClassName, Css Selector, Link Text, Partial Link Text, Tag Name,
		// Xpath

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		//driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(2000);
		
		/*
		 * //ID driver.findElement(By.id("input-firstname")).sendKeys("Mahesh");
		 * Thread.sleep(2000); //Name
		 * driver.findElement(By.name("lastname")).sendKeys("Jejurkar");
		 * Thread.sleep(2000); //LinkText
		 * driver.findElement(By.linkText("Login")).click(); Thread.sleep(2000);
		 * //PartialLinkText driver.findElement(By.partialLinkText("Reg")).click();
		 * Thread.sleep(2000); //ClassName
		 * driver.findElements(By.className("list-group-item")).get(0).click();
		 */
		
		List<WebElement> headerLinks =	driver.findElements(By.className("dropdown"));
		Iterator<WebElement> it = headerLinks.iterator();
		System.out.println("Header Links : ");
		while(it.hasNext()) {
		System.out.println(it.next().getText());
		}
		
		int totalImg = driver.findElements(By.tagName("img")).size();
		System.out.println("Total no. of images : "+totalImg);
		
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total no. of links : "+totalLinks);
		
		System.out.println(driver.findElement(By.tagName("img")).getAttribute("title"));
		
		Thread.sleep(5000);
		driver.close();

	}

}
