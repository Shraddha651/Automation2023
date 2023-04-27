package DDF_POM_TestNG_BaseClass_Utility;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	static WebDriver driver;
	public static void openBrowser() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swapnil Sanke\\Documents\\java\\chromedriver_win32 (2)\\chromedriver.exe" );
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		//handling notification
		co.addArguments("--disable-notifications");
		
		driver.manage().window().maximize();
		
		driver.navigate().to(UtilityClass.getPropertyFileData("url"));
		Thread.sleep(2000);
		
		//1.implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//2 Explicit Wait
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		
		//3 Fluent wait
		Wait<WebDriver> Wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofSeconds(5));
		
		
	}

}
