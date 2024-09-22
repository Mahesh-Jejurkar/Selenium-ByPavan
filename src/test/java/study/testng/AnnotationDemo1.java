package study.testng;

import org.testng.annotations.*;

//1. Open app
//2. Log in
//3. Log out

public class AnnotationDemo1 {
	@Test(priority=-1)
	void test1() {
		System.out.println("Executed : Test1");
	}
	
	@Test(priority=1)
	void test2() {
		System.out.println("Executed : Test2");
	}
	
	@Test(priority=3)
	void test3() {
		System.out.println("Executed : Test3");
	}
}