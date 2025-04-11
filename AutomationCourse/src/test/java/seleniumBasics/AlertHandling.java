package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifyalerts() {
	driver.navigate().to("https://demoqa.com/alerts");	
	WebElement simpleclick=driver.findElement(By.id("alertButton"));
	simpleclick.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	
	}
public void verifyconfirmalert() {
	driver.navigate().to("https://demoqa.com/alerts");	
	WebElement confirmclick=driver.findElement(By.id("confirmButton"));
	confirmclick.click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public void verifypromptalert() {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement promptclick=driver.findElement(By.id("promtButton"));
	promptclick.click();
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Hi Maneesh");
	alert.accept();
	
	
}
	public static void main(String[] args) {
		AlertHandling alert=new AlertHandling();
		alert.initializeBrowser();
		//alert.verifyalerts();
		//alert.verifyconfirmalert();
		alert.verifypromptalert();
		//alert.closeAndQuit();
		

	}

}
