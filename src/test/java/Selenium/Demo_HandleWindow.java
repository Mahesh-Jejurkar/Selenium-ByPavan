package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_HandleWindow {
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(7000);
		driver.close();
	}
	
	@Test
	public void testBrokenLinks() {
		String homepage = "http://www.deadlinkcity.com/";
		HttpURLConnection huc = null;
		int responseCode = 0;
		
		driver.get(homepage);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = allLinks.iterator();
		
		while(it.hasNext()) {
			String url = it.next().getAttribute("href");
			//System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			
			if(!url.startsWith(homepage)) {
				System.out.println("URL is belongs to another domain, hence skipping...");
				continue;
			}
			
			try {
					huc = (HttpURLConnection)(new URL(url)).openConnection();
					huc.connect();
					responseCode = huc.getResponseCode();
					if(responseCode >= 400) {
						System.out.println(url+" is a broken link.");
					}else {
						System.out.println(url+" is valid link");
					}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
