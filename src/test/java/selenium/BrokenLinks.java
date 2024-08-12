package selenium;

import java.util.Iterator;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> itr = links.iterator();

		while (itr.hasNext()) {
			String url = itr.next().getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection HUC = (HttpURLConnection) link.openConnection();
			HUC.connect();
			int responseCode = HUC.getResponseCode();

			if (responseCode >= 400) {
				System.out.println("Link is broken -> " + responseCode + "\t" + url);
			} else {
				System.out.println("Link is not broken -> " + responseCode + "\t" + url);
			}
			System.out.println();
		}

		Thread.sleep(3000);
		driver.close();
	}

}
