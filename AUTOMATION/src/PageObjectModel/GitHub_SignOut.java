package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignOut {
	
	@FindBy(xpath= "//button[contains(text(),'Sign out')]")private WebElement SignOut;
	
	public GitHub_SignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubSignout() {
		SignOut.click();
	}

}
