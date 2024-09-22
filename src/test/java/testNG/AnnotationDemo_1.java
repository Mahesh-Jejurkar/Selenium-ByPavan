package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//1. Login	--> @BeforeMethod
//2. Search	--> @Test
//3. Logout	--> @AfterMehod
//4. Login	--> @BeforeMethod
//5. Advanced search	--> @Test
//6. Logout	--> @AfterMethod

public class AnnotationDemo_1 {

	@BeforeMethod
	void login() {
		System.out.println("login()");
	}

	@AfterMethod
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
