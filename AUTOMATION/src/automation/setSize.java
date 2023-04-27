package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	
	public static void main(String[] args) throws InterruptedException {
		
     String expUrl = "https://www.selenium.dev/downloads/";
		
		//sets the browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//4. maximise
		driver.manage().window().maximize();
		
		//1. get()-- to open url
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		Dimension d = new Dimension(500,800);//500height--800width
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
