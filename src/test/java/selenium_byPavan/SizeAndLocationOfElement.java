package selenium_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationOfElement {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement orangehrm_logo = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img"));
		
		System.out.println("Location - Method 1");
		System.out.println("Location(x,y): "+orangehrm_logo.getLocation());
		System.out.println("Location(x): "+orangehrm_logo.getLocation().getX());
		System.out.println("Location(y): "+orangehrm_logo.getLocation().getY());
		System.out.println("------------------------------------------------------");
		
		
		System.out.println("Location - Method 2");
		System.out.println("Locaton(x): "+orangehrm_logo.getRect().getX());
		System.out.println("Locaton(y): "+orangehrm_logo.getRect().getY());
		System.out.println("------------------------------------------------------");
		
		System.out.println("Size - Method 1");
		System.out.println("Size(Width, Height): "+orangehrm_logo.getSize());
		System.out.println("Size(Width): "+orangehrm_logo.getSize().getWidth());
		System.out.println("Size(Height): "+orangehrm_logo.getSize().getHeight());
		System.out.println("------------------------------------------------------");
		
		System.out.println("Size - Method 2");
		System.out.println("Size(Width, Height): "+orangehrm_logo.getRect().getDimension());
		System.out.println("Size(Width): "+orangehrm_logo.getRect().getDimension().getWidth());
		System.out.println("Size(Height): "+orangehrm_logo.getRect().getDimension().getHeight());
		System.out.println("------------------------------------------------------");
		
		
		Thread.sleep(9000);
		driver.close();
	}

}
