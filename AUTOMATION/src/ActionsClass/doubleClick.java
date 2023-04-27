package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)" );
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
				
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				Thread.sleep(2000);
				
				WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
				
				Actions act = new Actions(driver);
				act.doubleClick(doubleClick).perform();
				
				Alert alt = driver.switchTo().alert();
				System.out.println(alt.getText());
				alt.accept();
				alt.dismiss();
				
				Thread.sleep(2000);
				
				driver.quit();
	}

}
