package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_Select {
	
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
		
		//step 2
		Select s = new Select(day);
		//s.selectByIndex(5);//6
		//s.selectByValue("30");//30
		s.selectByVisibleText("30");
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s.selectByVisibleText("May");
		Thread.sleep(4000);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s.selectByVisibleText("1994");
		
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
