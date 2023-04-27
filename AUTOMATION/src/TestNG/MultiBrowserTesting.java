package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName ) throws InterruptedException{
		WebDriver driver = null;
		 
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe" );
			
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(co);//upcasting
			
			}else if(browserName.equals("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe" );
				driver = new EdgeDriver();
				
			} else if(browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe" );
				driver = new FirefoxDriver();
				
				
			}else if(browserName.equals("ie")){
					
				System.setProperty("webdriver.ie.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe" );
				driver = new InternetExplorerDriver(); 
	}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.quit();
	

}
}