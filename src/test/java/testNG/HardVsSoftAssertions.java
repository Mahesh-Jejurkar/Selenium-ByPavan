package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
	void test_hardassertion() {
		System.out.println("Hard Assert Testing 1");
		System.out.println("Hard Assert Testing 2");
		
		Assert.assertEquals(1, 2);//Hard assertion
		
		System.out.println("Hard Assert Testing 3");
		System.out.println("Hard Assert Testing 4");
	}

	@Test
	void test_softassertion() {
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("Soft Testing 1");
		System.out.println("Soft Testing 2");
		
		softassert.assertEquals(1, 2);//Soft assertion
		
		System.out.println("Soft Testing 3");
		softassert.assertEquals("John", "Johnn");//Soft assertion
		System.out.println("Soft Testing 4");

		softassert.assertAll();//Mandatory
	}

}
