package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {
	
	@Test //Mark a class or a method as part of the test.

	public void test() {
		System.out.println("running test method");//msg will display on console not in a report
		Reporter.log("Running test method", false);//msg will display in report but not on console
		Reporter.log("running tesr Method", true);//msg will display on report ask on console
		
		
	}
	

}
