package javaprograms;

import org.testng.annotations.*;

public class PS3 {

	@BeforeMethod
	public void beforeTest() {
		System.out.println("Run me first...");
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("Run me last...");
	}

}
