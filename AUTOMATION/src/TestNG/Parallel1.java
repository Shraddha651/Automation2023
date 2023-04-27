package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
	public void TC1() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
        driver.manage().window().maximize();
		
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
