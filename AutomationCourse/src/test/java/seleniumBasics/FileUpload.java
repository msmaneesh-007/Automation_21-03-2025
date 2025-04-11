package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void verifyfileuploadusingsendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys("C:\\Users\\msman\\git\\Automation_21-03-2025\\AutomationCourse\\src\\test\\resources\\Selenium Notes from 24-03-2025.pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
		
		
		
	}

	public static void main(String[] args) {
		FileUpload file=new FileUpload();
		file.initializeBrowser();
		file.verifyfileuploadusingsendkeys();
		//file.closeAndQuit();
		}

}
