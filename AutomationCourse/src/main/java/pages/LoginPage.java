package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="user-name")private WebElement usernamefield;
@FindBy(id="password")private WebElement passwordfield;
@FindBy(id="login-button")private WebElement loginbutton;

public void enterUsernameOnUserNameField() {
	usernamefield.sendKeys("standard_user");
	
}

public void enterPasswordOnPasswordField() {
	passwordfield.sendKeys("secret_sauce");
}

public void clickONLoginButon() {
	loginbutton.click();
}

}
