package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks_1 {

	public static void main(String[] args) throws Exception {
		String homepage = "http://www.deadlinkcity.com/";
		String link_name; 
		String href_value;
		URL link_url = null;
		HttpURLConnection conn = null;
		int responseCode = 0;
		int countValidLink = 0;
		int countBrokenLink = 0;
		int countOtherDomainLink = 0;
		int countEmptyLink = 0;
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(homepage);
		Thread.sleep(2000);

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement links : alllinks) {
			link_name = links.getText();
			href_value = links.getAttribute("href");

			if (href_value == null || href_value.isEmpty()) {
				countEmptyLink++;
				System.out.println("Link is empty...");
				System.out.println("------------------------------------------------");
				continue;
			}

			if (!href_value.startsWith(homepage)) {
				countOtherDomainLink++;
				System.out.println("Link Text: " + link_name);
				System.out.println("href Value: " + href_value);
				System.out.println("Link is from another domain...");
				System.out.println("------------------------------------------------");
				continue;
			}

			try {
				link_url = new URL(href_value);
				conn = (HttpURLConnection) link_url.openConnection();
				conn.connect();
				responseCode = conn.getResponseCode();
				if (responseCode >= 400) {
					countBrokenLink++;
					System.out.println("Link Text: " + link_name);
					System.out.println("href Value: " + href_value);
					System.out.println("Response Code: " + responseCode);
					System.out.println("Link is broken link...");
					System.out.println("------------------------------------------------");
				} else {
					countValidLink++;
					System.out.println("Link Text: " + link_name);
					System.out.println("href Value: " + href_value);
					System.out.println("Response Code: " + responseCode);
					System.out.println("Link is valid link...");
					System.out.println("------------------------------------------------");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("No. of links: " + alllinks.size());
		System.out.println("No. of valid links: "+countValidLink);
		System.out.println("No. of broken links: "+countBrokenLink);
		System.out.println("No. of other domain links: "+countOtherDomainLink);
		System.out.println("No. of empty links:"+countEmptyLink);

		Thread.sleep(2000);
		driver.close();

	}

}
