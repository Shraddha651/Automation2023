package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GitHub_Test {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (2)\\chromedriver.exe" );
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		Thread.sleep(2000);
		
		GitHub_SignIn signIn = new GitHub_SignIn(driver);
		signIn.clickGitHubSignInBtn();
		
		Thread.sleep(5000);
		
		GitHub_LogIn login = new GitHub_LogIn(driver);
		login.setGitHubLoginUN();
		login.setGitHubLoginPWD();
		login.clickGitHubloginBtn();
		
		Thread.sleep(5000);
		
		GitHub_HomePage HomePage = new GitHub_HomePage(driver);
		HomePage.clickGitHubHomePagesignoutBtn();
		
		Thread.sleep(5000);
		
		GitHub_SignOut signout = new GitHub_SignOut(driver);
		signout.clickGitHubSignout();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
