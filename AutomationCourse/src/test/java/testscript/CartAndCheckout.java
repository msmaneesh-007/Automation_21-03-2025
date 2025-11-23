package testscript;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CartAndCheckout {

	public WebDriver driver;

	@Test
	public void sortValidationPriceHightoLow() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement usrname = driver.findElement(By.id("user-name"));
		usrname.sendKeys("standard_user");
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbtn.click();
		WebElement add2cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		add2cart.click();
		WebElement cartButton=driver.findElement(By.xpath("//div[@class='header_label']"));
		cartButton.click();
		WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		Robot robot = new Robot(); robot.delay(3000); robot.mouseMove(950, 337); 
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		WebElement name=driver.findElement(By.id("first-name"));
		name.sendKeys("RandomName");
		WebElement lastname=driver.findElement(By.id("last-name"));
		lastname.sendKeys("Random");
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("691022");
		WebElement continue1=driver.findElement(By.id("continue"));
		continue1.click();
		WebElement finish=driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();

	}
}
