package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void verifydropdown() {
		
		//driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown1);//bcuz all methods are in predifened Select class
		//select.selectByIndex(3);
		//select.selectByValue("python");
		select.selectByVisibleText("C#");
					
	}
	public void verifycheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//label[text()='Option 1']"));
		checkbox.click();
		//driver.findElement(By.xpath("//input[@value='option-2']"));//input[@value='option-1']"
		//checkbox.click();
		System.out.println(checkbox.isSelected());
	}
	
	public void verifyradiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='purple']"));
		radiobutton.click();
		//driver.findElement(By.xpath());"//input[@value='green']"
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown dropdown=new HandlingDropdown();
		dropdown.initializeBrowser();
		//dropdown.verifydropdown();
		dropdown.verifycheckbox();
		//dropdown.verifyradiobutton();
		//dropdown.closeAndQuit();
	}

}
