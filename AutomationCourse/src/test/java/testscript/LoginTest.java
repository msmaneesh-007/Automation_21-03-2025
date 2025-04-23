package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.TestNgBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNgBase {

	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username=ExcelUtility.getStringData(0, 0, "Login page");
		String password=ExcelUtility.getStringData(0, 1,"Login page");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username=ExcelUtility.getStringData(1, 0, "Login page");
		String password=ExcelUtility.getStringData(1, 1,"Login page");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
	}
	
	@Test
	public void verifyLoginWithInvalidUsernameAndValidPassword() throws IOException {
		String username=ExcelUtility.getStringData(2, 0, "Login page");
		String password=ExcelUtility.getStringData(2, 1,"Login page");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials() throws IOException {
		String username=ExcelUtility.getStringData(3, 0, "Login page");
		String password=ExcelUtility.getStringData(3, 1,"Login page");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
		
	}
	
}
