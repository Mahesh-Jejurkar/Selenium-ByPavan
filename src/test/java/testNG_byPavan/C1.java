package testNG_byPavan;

import org.testng.annotations.*;

public class C1 {
	
	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest method");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is AfterTest method.");
	}
	
	
	@Test
	void abc() {
		System.out.println("\tThis is abc() from C1.");
	}


}
