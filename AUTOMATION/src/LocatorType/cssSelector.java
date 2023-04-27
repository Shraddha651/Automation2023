package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[ type='text']")).sendKeys("shraddhar06@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[ placeholder='Password']")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[value='1']")).click();
		Thread.sleep(1000);
		
	
		
		
		driver.quit();
	}

}
