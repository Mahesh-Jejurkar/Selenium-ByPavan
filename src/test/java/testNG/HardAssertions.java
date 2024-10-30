package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void test() {
		Assert.assertEquals("Mahesh", "Mahesh");
		Assert.assertEquals(true, false);
		Assert.assertEquals(10, 10);
		Assert.fail();
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
}