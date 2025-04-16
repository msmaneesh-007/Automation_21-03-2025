package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.TestNgBase;

public class LoginTest extends TestNgBase {

	@Test
	public void verifyUserLoginWithValidCredentials() {
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
}
