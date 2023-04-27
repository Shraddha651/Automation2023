package automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPosition {
	
	public static void main(String[] args) throws InterruptedException {
		
       String expUrl = "https://www.selenium.dev/downloads/";
		
		//sets the browser configuration
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)\\chromedriver.exe");
       
       ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);//upcasting
		
		//4. maximise
		driver.manage().window().maximize();
		
		//1. get()-- to open url
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		//8.setposition
		Point p = new Point(1200,2700);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(20000);
		driver.quit();
	}

}
