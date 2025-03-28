package seleniumBasics;

public class BrowserCommands extends Base {

	public void verifyBrowserCommands() {
		String tittle = driver.getTitle();
		System.out.println(tittle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleid = driver.getWindowHandle();
		System.out.println(handleid);
		String pagesourse= driver.getPageSource();
		System.out.println(pagesourse);
	
	}

	public void verifyNavigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser = new BrowserCommands();
		browser.initializeBrowser();
		browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
		//browser.closeAndQuit();
		
	}

}
