package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable_getRowSize_getCellSize {
	
	public static void main(String[] args) throws InterruptedException  {
		
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (2)\\chromedriver.exe" );
			 ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			//handling notification
			co.addArguments("--disable-notifications");
			
		   WebDriver driver = new ChromeDriver(co);//upcasting
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/Swapnil%20Sanke/Documents/java/HTML/WebTable.html");
			Thread.sleep(2000);
			
			java.util.List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='12345']//tr"));
			int rowSize = allRows.size();
			System.out.println(rowSize);
			
			int colSize = driver.findElements(By.xpath("//table[@class='12345']//tr[1]//th")).size();
			System.out.println(colSize);
			driver.quit();
	}

}

