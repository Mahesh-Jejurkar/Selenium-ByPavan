package testNG;

import org.testng.annotations.*;

//1. Login	--> @BeforeClass
//2. Search	--> @Test
//3. Adv. search	--> @Test
//4. Logout	--> @AfterClass

public class AnnotationDemo_2 {

	@BeforeClass
	void login() {
		System.out.println("login()");
	}

	@AfterClass
	void logout() {
		System.out.println("logout()");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("search()");
	}

	@Test(priority = 2)
	void advancedsearch() {
		System.out.println("advancedsearch()");
	}

}
