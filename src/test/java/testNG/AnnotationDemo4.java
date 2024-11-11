package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/*1. OpenApp
2. Login 
3. Search
4. Adv. Search
5. Logout
*/
public class AnnotationDemo4 {
	@Test(priority=1)
	void openapp() {
		Assert.assertTrue(true);
		System.out.println("Openapp");
	}
	
	@Test(priority=2, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertTrue(true);
		System.out.println("Login");
	}
	
	@Test(priority=3, dependsOnMethods = {"login"})
	void search() {
		Assert.assertTrue(true);
		System.out.println("Search");
	}
	
	
	@Test(priority=4, dependsOnMethods = {"login"})
	void advsearch() {
		Assert.assertTrue(true);
		System.out.println("Adv Search");
	}
	
	@Test(priority=5, dependsOnMethods = {"login", "search"})
	void logout() {
		Assert.assertTrue(true);
		System.out.println("Logout");
	}

}
