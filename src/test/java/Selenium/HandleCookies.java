package Selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleCookies {
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(9000);
		driver.close();
	}
	
	@Test
	public void testCookies() {
		driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123xyz");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		for(Cookie c : allCookies) {
			System.out.println(c);
		}
		
		File file = new File(".\\src\\test\\java\\selenium\\Cookies.data");
		try {
			file.delete();
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			Set<Cookie> allCookies2 = driver.manage().getCookies();
			for(Cookie c : allCookies2) {
				bw.write(c.getName()+";"+c.getValue()+";"+c.getDomain()+";"+c.getPath()+";"+c.getExpiry()+";"+c.isSecure());
				bw.newLine();
			}
			bw.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
