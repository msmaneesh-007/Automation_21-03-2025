package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	
	public WebDriver driver;
	
	@Test
	public void loginWithvalidCredentials() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement usrname=driver.findElement(By.id("user-name"));
		usrname.sendKeys("standard_user");
		WebElement pswd=driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		//driver.quit();
		
	}
	@Test
	public void invalidCredentialsValidation() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement usrname=driver.findElement(By.id("user-name"));
		usrname.sendKeys("standard_user");
		WebElement pswd=driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce554476");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		WebElement invalidloginErrormsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
		Assert.assertTrue(invalidloginErrormsg.isDisplayed());
		driver.quit();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage obj=new LoginPage();
		obj.invalidCredentialsValidation();
		
	}

}
