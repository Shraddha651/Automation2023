package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragN_Drop {

	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)" );
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
				
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				Thread.sleep(2000);
				
				WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
				
				WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
				Actions act = new Actions(driver);
				
				//act.clickAndHold(src).moveToElement(dest).release().build().perform();
				
				act.dragAndDrop(src, dest);
				
				Thread.sleep(2000);
				driver.quit();
	}
}
