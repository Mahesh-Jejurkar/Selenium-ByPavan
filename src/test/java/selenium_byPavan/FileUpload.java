package selenium_byPavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload extends BaseClass{

	public static void main(String[] args) throws Exception{
		WebDriver driver = getDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		WebElement input_fileupload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		input_fileupload.sendKeys(System.getProperty("user.dir")+"\\input-files\\Dummy.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Thread.sleep(2000);
		String actual_msg = driver.findElement(By.xpath("//div[@class='formbuttons'][2]/h3")).getText();
		String expected_msg = "has been successfully uploaded";
		
		if(actual_msg.contains(expected_msg)) {
			System.out.println("Test passed...");
		}else {
			System.out.println("Test failed...");
		}
		
		closeDriver();
	}
}
