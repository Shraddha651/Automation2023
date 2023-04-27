package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2_printTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (2)\\chromedriver.exe");
		 ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(co);
			
			//handling notification
			co.addArguments("--disable-notifications");
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Swapnil%20Sanke/Documents/java/HTML/WebTable.html");
			Thread.sleep(2000);
			int rowSize = driver.findElements(By.xpath("//table[@class='12345']//tr")).size();
			
			for(int i=1;i<=rowSize;i++) {
				int colSize = 0;
				if(i==1) {
					colSize=driver.findElements(By.xpath("//table[@class='12345']//tr["+i+"]//th")).size();
				}else {
					colSize=driver.findElements(By.xpath("//table[@class='12345']//tr["+i+"]//td")).size();
				}
				for(int j=1;j<=colSize;j++) {
					String text = "";
					if(i==1) {
						text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//th["+j+"]")).getText();
					}else {
						text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//td["+j+"]")).getText();
					}
					System.out.print(text+" ");
					
				}
				System.out.println();
			}
			Thread.sleep(2000);
			driver.quit();
	}

}
