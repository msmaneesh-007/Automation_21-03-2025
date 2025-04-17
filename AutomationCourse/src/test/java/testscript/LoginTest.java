package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNgBase;

public class LoginTest extends TestNgBase {

	@Test
	public void verifyUserLoginWithValidCredentials() {
		
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField();
		login.enterPasswordOnPasswordField();
		login.clickONLoginButon();
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("locked_out_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("invalidpassword");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	@Test
	public void verifyLoginWithInvalidUsernameAndValidPassword() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("invalidPassword");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
	}
	
}
