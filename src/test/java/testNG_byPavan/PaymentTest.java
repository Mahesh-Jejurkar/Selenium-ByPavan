package testNG_byPavan;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority = 1, groups = {"sanity", "regression", "functional"})
	void paymentInRupees() {
		System.out.println("This is paymentInRupees.");
	}
	
	@Test(priority = 2, groups = {"sanity", "regression", "functional"})
	void paymentInDoller() {
		System.out.println("This is paymentInDoller.");
	}
}
