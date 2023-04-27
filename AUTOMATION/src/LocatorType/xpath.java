package LocatorType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		// xpath by attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shraddhar06@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("shrur111");
		Thread.sleep(1000);
		
		// xpath by text
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	    Thread.sleep(1000);
		
		// xpath by contains
		//driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		//Thread.sleep(1000);
		
		// xpath by index
		//driver.findElement(By.xpath("(//a[contains(text(),'create')])[1]")).click();
		//Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("(//a[contains(text(),'Forgotten password?')])[1]")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
