package Selenium;

import java.net.HttpURLConnection;
import java.net.ResponseCache;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinks_2 {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(15000);
		driver.close();
	}
	
	@Test
	public void testBrokenLinks() {
		int validCount = 0;
		int invalidCount = 0;
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		try {
			
			for(WebElement link : allLinks) {
				String url = link.getAttribute("href");
				HttpURLConnection huc = (HttpURLConnection)new URL(url).openConnection();
				huc.connect();
				if(huc.getResponseCode()==200) {
					System.out.println(url+" is valid URL.");
					validCount ++;
				}
				else {
					System.out.println(url+ " is not valid URL.");
					invalidCount ++;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Valid link count: "+validCount);
		System.out.println("Invalid link count: "+invalidCount);
	}

}
