package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class getCaptcha {

	public static void main(String[] args) throws Exception {
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://myaadhaar.uidai.gov.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		WebElement image_captcha = driver.findElement(By.xpath("//div[@class='form-section']//div[1]//img[1]"));
		File src = image_captcha.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\screenshot\\captcha.png";
		FileHandler.copy(src, new File(path));
		Thread.sleep(5000);
		ITesseract image = new Tesseract();
		String captch_string = image.doOCR(new File(path));
		System.out.println("Image OCR done...");
		System.out.println(captch_string);

		
		Thread.sleep(9000);
		driver.close();
	}

}
