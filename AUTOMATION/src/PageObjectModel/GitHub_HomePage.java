package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_HomePage {
	
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement signOutBtn;
	
	public GitHub_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGitHubHomePagesignoutBtn() {
		signOutBtn.click();
	}

}
