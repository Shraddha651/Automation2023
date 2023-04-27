package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_Assertions {

	// hard assert
	// 1. assertEquals
	@Test
	public void test1() {
		Reporter.log("running test1 method", true);
		String expResult = "good night";
		String actResult = "good night";
		
		Assert.assertEquals(actResult, expResult,"act & exp is not equal");
		
		}
	//2 assertNotequal
	
	@Test
	public void test2() {
		Reporter.log("running test2 method", true);
		String expResult = "good night";
		String actResult = "good morning";
		
		Assert.assertNotEquals(actResult, expResult, "act & exp result is similar");
	}
	// 3.aeertTrue
	@Test
	public void test3() {
		Reporter.log("running test3 method", true);
		boolean result = true;
		
		Assert.assertTrue(result,"result is false");
		
	}
	
//4.  assertFalse
	@Test
	public void test4() {
		Reporter.log("running test4 method", true);
		boolean result = true;
		
		Assert.assertTrue(result,"result is true");
	
}
	
	// 5. assertNull
	@Test
	public void test5() {
		Reporter.log("running test5 method", true);
		String result = null;
		
		Assert.assertNull(result, "result is not null");
	
}
	// 6.assertNotNull
	@Test
	public void test6() {
		Reporter.log("running test6 method", true);
		String result = "quantum academy";
		
		Assert.assertNotNull(result, "result is null");;
	
	}	
	// 7. assertFail
	@Test
	public void test7() {
		Reporter.log("running test6 method", true);
		Assert.fail();
		
	}	
	
	
	
}