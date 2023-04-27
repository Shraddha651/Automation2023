package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_LogIn {
	
	//declaration
	@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(css = "input[type='submit']")private WebElement loginBtn;
	
	// 2. initialization
	public GitHub_LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//3. usage
	public void setGitHubLoginUN() {
		UN.sendKeys("rautshraddha651@gmail.com");
			}
	public void setGitHubLoginPWD() {
		PWD.sendKeys("raut4943");
	}
	
	public void clickGitHubloginBtn() {
		loginBtn.click();
		
		
		
		
	}
	
}