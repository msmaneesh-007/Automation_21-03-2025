package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void verifyLocators() {
		driver.navigate().to("https://selenium.qabible.in/");
		WebElement showmessageButton=driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Checkbox Demo"));
		driver.findElement(By.partialLinkText("Checkbox Demo"));
		driver.findElement(By.cssSelector("input[id=\"single-input-field\"]"));
		 driver.findElement(By.cssSelector("button[id='button-one']"));
	     // /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button absolute xpath
	      driver.findElement(By.xpath("//button[@id='button-two']"));
	      driver.findElement(By.xpath("//button[text()='Show Message']"));
	      driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
	      driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	      driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	      driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
	      driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	      driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	      driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
	      driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
	      driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.verifyLocators();
		locators.closeAndQuit();
		
		
	}

}
