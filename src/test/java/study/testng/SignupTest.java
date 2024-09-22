package study.testng;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority=1, groups= {"regression"})
	void signupByEmail() {
		System.out.println("signupByEmail");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupByFacebook() {
		System.out.println("signupByFacebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signupByTwitter() {
		System.out.println("signupByTwitter");
	}

}
