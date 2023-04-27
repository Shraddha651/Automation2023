package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)" );
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
				
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(2000);
				
				WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
				
				Actions act = new Actions(driver);
				
				act.moveToElement(more).perform();
				
				Thread.sleep(2000);
				driver.quit();
	}

}
