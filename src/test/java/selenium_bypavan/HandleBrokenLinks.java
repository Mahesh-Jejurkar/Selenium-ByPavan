package selenium_bypavan;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleBrokenLinks extends BaseClass {
	public static void main(String[] args) throws Exception {
		String homepage = "http://www.deadlinkcity.com/";
		HttpURLConnection conn = null;
		int responsecode = 0;
		int countValidLink = 0;
		int countBrokenLink = 0;
		int countOtherDomainLink = 0;
		int countEmptyLink = 0;

		WebDriver driver = getDriver();

		driver.get(homepage);
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for (WebElement link : allLinks) {
			String href_value = link.getAttribute("href");
			String link_name = link.getText();

			if (href_value == null || href_value.isEmpty()) {
				countEmptyLink++;
				System.out.println(link_name+" => "+href_value+" => URL is null or empty, so not possible to check.");
				continue;
			}
			
			if(!href_value.startsWith(homepage)) {
				countOtherDomainLink++;
				System.out.println(link_name+" => "+href_value+" => URL belongs to another domain, so skipping it. ");
				continue;
			}

			try {
				URL url = new URL(href_value); // Converted href value from string to URL format.
				conn = (HttpURLConnection) url.openConnection(); // Open connection to server.
				conn.connect(); // Connect to server and send request to server.
				responsecode = conn.getResponseCode();
				if (responsecode >= 400) {
					countBrokenLink ++;
					System.out.println(link_name+" => "+url + " => is broken link.");
				} else {
					countValidLink++;
					System.out.println(link_name+" => "+url + " => is a valid link.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("No. of broken links => "+countBrokenLink);
		System.out.println("No. of valid links => "+countValidLink);
		System.out.println("No. of another domain links => "+countOtherDomainLink);
		System.out.println("No. of empty links => "+countEmptyLink);
		
		closeDriver();
	}
}