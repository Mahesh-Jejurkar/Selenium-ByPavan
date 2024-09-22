package study.testng;

import org.testng.annotations.*;

/*1. Login
2. Search
3. Adv. Search
4. Logout
*/


public class AnnotationDemo3 {

	@BeforeClass
	void login() {
		System.out.println("This is login...");
	}
	
	@AfterClass
	void logout() {
		System.out.println("This is logout...");
	}
	
	@Test(priority = 1)
	void search() {
		System.out.println("This is search...");
	}
	
	@Test(priority=2)
	void advSearch() {
		System.out.println("This is advanced search...");
	}
}
