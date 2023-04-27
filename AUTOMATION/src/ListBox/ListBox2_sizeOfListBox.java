package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_sizeOfListBox {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (1)" );
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(co);
				
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
				Thread.sleep(4000);
				//step 1
				//findElement -> WebElement
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
				Select s = new Select(day);
				List<WebElement> allOptions = s.getOptions();
				System.out.println("List Box size:"+allOptions.size());
				
				for(WebElement opt:allOptions) {
					System.out.println(opt.getText());
					
				}
				
				Thread.sleep(2000);
				driver.quit();
	}
}
