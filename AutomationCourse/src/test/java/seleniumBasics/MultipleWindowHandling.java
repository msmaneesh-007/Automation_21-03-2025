package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base {

	public void verifywindowhandling() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindowhandleid=driver.getWindowHandle();
		System.out.println(firstwindowhandleid);
		WebElement clickhere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String>handleids=driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String>values=handleids.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(firstwindowhandleid))
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("msmaneeshmohan12005@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
	}
	public static void main(String[] args) {

		MultipleWindowHandling windowhandling=new MultipleWindowHandling();
		windowhandling.initializeBrowser();
		windowhandling.verifywindowhandling();
		//windowhandling.closeAndQuit();
	}

}
