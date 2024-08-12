package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_SwitchFrames1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frame_SwitchFrames1.html");
		Thread.sleep(5000);

		List<WebElement> frameList = driver.findElements(By.xpath("//iframe"));
		int noOfFrames = frameList.size();
		System.out.println(noOfFrames);

		Thread.sleep(2000);
		driver.navigate().to("https://demo.automationtesting.in/Register.html");

		WebElement addressTextarea = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

		int widthSize = addressTextarea.getSize().getWidth();
		int heighSize = addressTextarea.getSize().getHeight();

		System.out.println("Dimensions : " + widthSize + ":" + heighSize);

		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();

		Thread.sleep(5000);
		driver.quit();
	}
}
