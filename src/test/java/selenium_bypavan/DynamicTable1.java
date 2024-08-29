package selenium_bypavan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTable1 extends BaseClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		getJS().executeScript("window.scrollTo(0, document.body.scrollHeight);");
		int noOfpages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();

		for (int page = 1; page <= noOfpages; page++) {
			Thread.sleep(2000);
			if (page > 1) {
				driver.findElement(By.xpath("//ul[@id='pagination']//li[" + page + "]")).click();
			}
			int row = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			for (int r = 1; r <= row; r++) {
				String pid = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[1]"))
						.getText();
				String pname = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]"))
						.getText();
				String pprice = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]"))
						.getText();
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]/input")).click();
				System.out.println(pid + "\t" + pname + "\t" + pprice);
			}
		}
		closeDriver();
	}
}
