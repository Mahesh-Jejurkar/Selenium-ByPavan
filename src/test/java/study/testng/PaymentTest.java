package study.testng;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority=2, groups= {"sanity", "regression", "functional"})
	void paymentInDollar() {
		System.out.println("paymentInDollar");
	}
	
	@Test(priority=1, groups= {"sanity", "regression", "functional"})
	void paymentInRupees() {
		System.out.println("paymentInRupees");
	}
}
