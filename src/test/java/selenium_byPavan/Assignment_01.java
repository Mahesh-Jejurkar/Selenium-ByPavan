package selenium_byPavan;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment_01 extends BaseClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = getDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'wikipedia')]")).sendKeys("Selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		Thread.sleep(5000);

		List<WebElement> searchResult = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		int totalSearchResult = searchResult.size();
		System.out.println("Total no. of links searched : " + totalSearchResult);

		for (WebElement sr : searchResult) {
			Thread.sleep(2000);
			String linkName = sr.getText();
			String linkAddress = sr.getAttribute("href");
			System.out.println(linkName + " : " + linkAddress);
			sr.click();
		}

		System.out.println();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String wh : windowHandles) {
			String windowTitle = driver.switchTo().window(wh).getTitle();
			System.out.println(windowTitle + " : " + wh);
		}

		Thread.sleep(7000);

		for (String wh : windowHandles) {
			String windowTitle = driver.switchTo().window(wh).getTitle();
			if (windowTitle.equals("Selenium disulfide - Wikipedia")
					|| windowTitle.equals("Selenium in biology - Wikipedia")) {
				driver.close();
			}
		}

		closeDriver();
	}
}