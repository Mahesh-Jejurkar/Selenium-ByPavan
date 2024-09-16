package testNG_byPavan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testTitle() {
		String exp_title = "Opencart";
		String act_title = "Opencart";
		
//		if(act_title.equals(exp_title)) {
//			System.out.println("Test passed...");
//		}else {
//			System.out.println("Test failed...");
//		}
		Assert.assertEquals(exp_title, act_title);
	}
}
