package testNG;

import org.testng.annotations.Test;

public class AnnotationDemo5 {
	
	@Test(priority = 3)
	public void testLogin() {
		System.out.println("Test Login");
	}
	
	@Test(priority = 2)
	public void testSearch() {
		System.out.println("Test Search");
	}
	
	@Test(priority = 1, dependsOnMethods = {"testSearch"})
	public void testAdvSearch() {
		System.out.println("Test Adv Search");
	}

}
