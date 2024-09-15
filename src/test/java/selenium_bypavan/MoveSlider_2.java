package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSlider_2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#default");
		Thread.sleep(2000);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		WebElement element_sliderstarthead = driver.findElement(By.xpath("//div[@id='slider']//span[1]"));
		action.clickAndHold(element_sliderstarthead).build().perform();
		
		for (int p = 0; p <= 90; p++) {
			Thread.sleep(200);
			String leftposition = p + "%";
			js.executeScript("arguments[0].style.left=arguments[1]", element_sliderstarthead, leftposition);
		}
		
		action.release(element_sliderstarthead).build().perform();
		
		Thread.sleep(1000);
		driver.close();
	}
}
