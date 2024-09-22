package study.testng;

import org.testng.annotations.*;

/*	1. Login		-> @BeforeMethod
	2. Search		-> @Test
	3. Logout		-> @AfterMethod
	4. Login
	5. Adv. Search	-> @Test
	6. Logout
*/

public class AnnotationDemo2{
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Executed : BeforeSuite");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("Executed : AfterSuite");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Executed : BeforeTest");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("Executed : AfterTest");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("Executed : BeforeMethod");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("Executed : AfterMethod");
	}
	
	@Test(priority=-1)
	void test1() {
		System.out.println("Executed : Test1");
	}
	
	@Test
	void test2() {
		System.out.println("Executed : Test2");
	}
	
	@Test(priority = 1)
	void test3() {
		System.out.println("Executed : Test3");
	}
	
	@Test(priority = 2)
	void test4() {
		System.out.println("Executed : Test4");
	}
}
