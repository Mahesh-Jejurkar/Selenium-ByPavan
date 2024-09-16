package testNG_byPavan;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
//	@Test
	void test_hardassertion() {
		System.out.println("Testing...");
		System.out.println("Testing...");
		
		Assert.assertEquals(1, 2);//Hard assertion
		
		System.out.println("Testing...");
		System.out.println("Testing...");
	}

	@Test
	void test_softassertion() {
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("Testing...");
		System.out.println("Testing...");
		
		softassert.assertEquals(1, 2);//Soft assertion
		
		System.out.println("Testing...");
		softassert.assertEquals("John", "Johnn");//Soft assertion
		System.out.println("Testing...");

		softassert.assertAll();//Mandatory
	}

}
