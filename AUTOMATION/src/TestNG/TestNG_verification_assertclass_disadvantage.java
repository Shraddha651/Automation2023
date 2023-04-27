package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_verification_assertclass_disadvantage {
	
	//Hard Assert
	@Test
	public void test() {
		String expResult = "good night";
		String actResult = "good morning";
		boolean result = false;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult, "verification 1: act & exp result is same");
		
		// verification 2
		Assert.assertEquals(actResult, expResult,"verification 2 :act & exp result is different");
		
		//verification 3
		Assert.assertTrue(result, "verification 3:result is false");
		
		//disadvantage
		//java.lang.AssertionError: verification 2 :act & exp result is different expected [good night] but found [good morning]
	}

}
