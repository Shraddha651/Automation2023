package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openBrowser {
	
	public static void main (String[]args ) throws InterruptedException {
		String expUrl= "https://www.selenium.dev/downloads/";
		
		//open browser
		//System.setProperty("webdriver.chrome,driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);//upcasting
		
		// maximise
		driver.manage().window().maximize();
		
		// get() open url
		driver.get("https://www.selenium.dev/downloads/");
		
		//minimise
		driver.manage().window().minimize();
		
		// get current url
		String actUrl = "https://www.selenium.dev/downloads/";
		System.out.println(actUrl);//https://www.selenium.dev/downloads/
		
		if(actUrl.equals(expUrl)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);
		
		//close
		// driver.close();
		
		// quit
		driver.quit();
	}

}
