package study.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo2 {
	
	@Test
	public void test1() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Mahesh", "Mahesh");
		System.out.println("First assert executed...");
		
		sa.assertEquals(123, 120);
		System.out.println("Second assert executed...");
		
		sa.assertEquals(120, 120);
		System.out.println("Third assert executed...");
		
		sa.assertAll();
	}
}