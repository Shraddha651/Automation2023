package DDF_POM_TestNG_BaseClass_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {
	
	GitHub_SignIn signIn;
	GitHub_Login login;
	GitHub_Home home;
	GitHub_SignOut signOut;
	
	@BeforeClass
	public void browserOpen() throws InterruptedException, IOException {
		openBrowser();
		signIn = new GitHub_SignIn(driver);
		login = new GitHub_Login(driver);
		home = new GitHub_Home(driver);
		signOut = new GitHub_SignOut(driver);
		Thread.sleep(2000);		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		signIn.clickGitHubSignInButton();
		
		login.setGitHubLoginUserName(UtilityClass.getTestData(0, 0));
		login.setGitHubLoginPassword(UtilityClass.getTestData(0, 1));
		login.clickGitHubLoginButton();
		Thread.sleep(2000);
		
		home.clickGitHubHomeLogOutBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException {
		String expResult = UtilityClass.getTestData(0, 2);
		String actResult = home.verifyGitHubHomePageUN();
		Thread.sleep(2000);
		Assert.assertEquals(actResult, expResult,"act & exp result is different");
	}
	
	//ITestResult-listener,this class describe the result of test
	
	@AfterMethod
	public void logOut(ITestResult result) throws IOException, InterruptedException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID = 100;
			UtilityClass.captureScreenshot(driver, TCID);
			Thread.sleep(2000);
		}
		
		signOut.clickGitHubsignOutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}


}
