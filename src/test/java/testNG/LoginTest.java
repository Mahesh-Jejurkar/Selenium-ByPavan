package testNG;

import org.testng.annotations.Test;

public class LoginTest {
	@Test(priority=1, groups= {"sanity"})
	void loginByEmail() {
		System.out.println("loginByEMail");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("loginByFacebook");
	}

	@Test(priority=3, groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("loginByTwitter");
	}
}
