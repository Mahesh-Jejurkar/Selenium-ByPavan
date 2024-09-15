package selenium_bypavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWebTable_1 {

	public static void main(String[] args) throws Exception{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		WebElement label_webtable	= driver.findElement(By.xpath("//h2[text()='Web Table']"));
		js.executeScript("arguments[0].scrollIntoView()", label_webtable);
		
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		
		for(int r=2; r<=noOfRows; r++) {
			WebElement element_BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[1]"));
			String BookName = element_BookName.getText();
			changeColor(driver, element_BookName);
			
			WebElement element_Author = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[2]"));
			String Author = element_Author.getText();
			changeColor(driver, element_Author);
			
			WebElement element_Subject = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[3]"));
			String Subject = element_Subject.getText();
			changeColor(driver, element_Subject);
			
			WebElement element_Price = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[4]"));
			String Price = element_Price.getText();
			changeColor(driver, element_Price);
			
			System.out.println(BookName+"\t"+Author+"\t"+Subject+"\t"+Price);
			
		}
		Thread.sleep(10000);
		driver.close();
	}
	
	public static void changeColor(WebDriver driver , WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 255, 0, 1)'", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 0, 0, 0)'", element);
	}

}
