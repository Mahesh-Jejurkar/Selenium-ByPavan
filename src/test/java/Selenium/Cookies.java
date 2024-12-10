package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cookies
{
	WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		Thread.sleep(2000);
	}

	@AfterClass
	public void tearDown() throws Exception 
	{
		Thread.sleep(10000);
		driver.close();
	}

	@Test(priority = 1)
	public void getAllCookies() 
	{
		System.out.println("*****Get All Cookies*****");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Cookie size: " + allCookies.size());

		for (Cookie ck : allCookies) 
		{
			System.out.println(ck);
		}
	}

	@Test(priority = 2)
	public void addCookie() 
	{
		System.out.println("*****Add New Cookie*****");
		Cookie myCookie = new Cookie("Mahesh", "mahesh@1990");
		driver.manage().addCookie(myCookie);

		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Cookie size after addition: " + allCookies.size());

		for (Cookie ck : allCookies) 
		{
			System.out.println(ck);
		}
	}

	@Test(priority = 3)
	public void getSpecificCookie() 
	{
		System.out.println("*****Get Specific Cookie*****");
		Cookie ck = driver.manage().getCookieNamed("Mahesh");
		System.out.println(ck);
	}

//	@Test(priority = 4)
	public void deleteSpecificCookie() 
	{
		System.out.println("*****Delete Specific Cookie*****");
		driver.manage().deleteCookieNamed("Mahesh");
	}
	
	@Test(priority = 4)
	public void deleteAllCookie() {
		System.out.println("*****Delete All Cookies*****");
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 5)
	public void getAllCookies2() 
	{
		System.out.println("*****Get All Cookies*****");
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Cookie size: "+allCookies.size());
		
		if(allCookies.size()!=0) 
		{
			for (Cookie ck : allCookies) 
			{
				System.out.println(ck);
			}
		}
		else 
		{
			System.out.println("No cookies to display...");
		}
	}

}