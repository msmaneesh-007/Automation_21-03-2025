package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tablehandling extends Base{
	
	public void verifytablehandling() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showmore=driver.findElement(By.id("showMoreLess"));
		showmore.click();
		WebElement datatable=driver.findElement(By.id("dataTable"));
		System.out.println(datatable.getText());
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
		System.out.println(tablerow.getText());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablehandling table=new Tablehandling();
		table.initializeBrowser();
		table.verifytablehandling();
		//table.closeAndQuit();
	}

}
