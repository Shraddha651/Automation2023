package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_verification_softAssert {
	
	@Test
	public void test() {
		String expResult = "good night";
		String actResult = "good morning";
		boolean result = false;
		SoftAssert soft = new SoftAssert();
		
		//verification 1
		soft.assertNotEquals(actResult, expResult,"verification 1:act & exp result is equal");
		
		//verification 2
		soft.assertEquals(actResult, expResult,"verification 2:act & exp result is different");
		
		//verification 3
		soft.assertTrue(result, "verification 3:result is false");
		
		soft.assertAll();
		//java.lang.AssertionError: The following asserts failed:
		//verification 2:act & exp result is different expected [good night] but found [good morning],
		//verification 3:result is false expected [true] but found [false]
	}

}
