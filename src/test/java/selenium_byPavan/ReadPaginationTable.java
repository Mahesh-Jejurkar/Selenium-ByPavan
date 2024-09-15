package selenium_byPavan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPaginationTable {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		WebElement label_table = driver.findElement(By.xpath("//h2[text()='Pagination Table']"));
		js.executeScript("arguments[0].scrollIntoView()", label_table);

		int noOfPages = driver.findElements(By.xpath("//ul[@id='pagination']//li//a")).size();
		System.out.println(noOfPages);

		for (int p = 1; p <= noOfPages; p++) {
			driver.findElement(By.xpath("//ul[@id='pagination']//li[" + p + "]//a")).click();
			int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			for (int r = 1; r <= noOfRows; r++) {
				WebElement element_ID = driver
						.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[1]"));
				String ID = element_ID.getText();
				changeColor(driver, element_ID);

				WebElement element_Name = driver
						.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]"));
				String Name = element_Name.getText();
				changeColor(driver, element_Name);

				WebElement element_Price = driver
						.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]"));
				String Price = element_Price.getText();
				changeColor(driver, element_Price);

				WebElement element_select = driver
						.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]"));
				WebElement elemen_checkbox = driver
						.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]//input"));
				elemen_checkbox.click();
				changeColor(driver, element_select);

				System.out.println(ID + "\t" + Name + "\t" + Price);
			}
		}
	}

	public static void changeColor(WebDriver driver, WebElement element) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 255, 0, 1)'", element);
		Thread.sleep(1000);
		js.executeScript("arguments[0].style.backgroundColor='rgba(0, 0, 0, 0)'", element);
	}
}
