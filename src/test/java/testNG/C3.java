package testNG;

import org.testng.annotations.*;

public class C3 {
	
	@BeforeSuite
	void bs() {
		System.out.println("This is BeforeSuite method.");
	}
	
	@AfterSuite
	void as() {
		System.out.println("This is AfterSuite method.");
	}
	
	@Test
	void pqr() {
		System.out.println("\tThis is pqr() from C3");
	}

}
