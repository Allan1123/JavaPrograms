package week10day1;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void softassert() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("SA was executed");
		softassert.assertTrue(false);
		System.out.println("SA was not executed");
		softassert.assertTrue(true);
	
	}
	
	@Test
	public void hardAssert() {
		System.out.println("Hard was executed");
		Assert.assertTrue(false);
		System.out.println("Hard was not executed");
	
	}
	
	
}
