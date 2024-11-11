package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void test_Title() {
		String exp_title = "Opencart";
		String act_title = "Opencartt";

		/*
		 * if (exp_title.equals(act_title)) { System.out.println("Passed..."); } else {
		 * System.out.println("Failed..."); }
		 */
		
		Assert.assertEquals(act_title, exp_title);
	}
}
