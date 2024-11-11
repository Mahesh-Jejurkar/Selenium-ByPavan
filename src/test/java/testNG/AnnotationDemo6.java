package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo6 extends AnnotationDemo5{
	@BeforeClass
	public void setUp() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("After Class");
	}
	
	@Test
	public void testA() {
		System.out.println("testA");
	}
	
	@BeforeMethod
	public void testBB() {
		System.out.println("testBB");
	}
	
	@AfterMethod
	public void testAA() {
		System.out.println("testAA");
	}
}
