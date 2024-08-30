package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderMovment extends BaseClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		Actions act = getActions();

		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement label_slider = driver.findElement(By.xpath("//h2[text()='Slider']"));
		js.executeScript("arguments[0].scrollIntoView(true)", label_slider);
		Thread.sleep(1000);

		WebElement we_sliderhead = driver.findElement(By.xpath("//div[@id='slider']//span"));
		System.out.println(we_sliderhead.getLocation()); // (889, 1081)=>(x, y)

		for (int x=0; x <= 20; x++) {
			act.dragAndDropBy(we_sliderhead,x,0).build().perform(); // Here we don't want to move Y axis hence we kept
																		// at 0 mean it's original value i.e. 1081
		}
		System.out.println(we_sliderhead.getLocation());
		
		closeDriver();
	}
}
