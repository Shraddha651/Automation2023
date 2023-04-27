package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		//(1)\\System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 xe");
	    ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Swapnil%20Sanke/Documents/java/HTML/login%20form.html");
		
		Thread.sleep(2000);
		// tag name
		driver.findElement(By.tagName("input")).sendKeys("q@gmail.com");
		
		Thread.sleep(2000);
		
		//id
		driver.findElement(By.id("12345")).sendKeys("1234567");
		Thread.sleep(2000);
		
		// name
		driver.findElement(By.name("abc")).sendKeys("qa@123.com");
		Thread.sleep(2000);
		
		//class name
		driver.findElement(By.className("class123")).sendKeys("123456789");
		Thread.sleep(2000);
		
		// link text
		driver.findElement(By.linkText("Link1")).click();
		Thread.sleep(2000);
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Li")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
