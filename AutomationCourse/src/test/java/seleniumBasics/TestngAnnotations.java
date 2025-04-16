package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
@Test
	public void testcase() {
		System.out.println("This is a test case");
	}
@BeforeMethod
public void beforemethod() {
	System.out.println("Before method");
}
@AfterMethod
public void aftermethod() {
	System.out.println("After Method");
}
@BeforeClass
public void beforeclass() {
	System.out.println("Before class");
}
@AfterClass
public void afterclass() {
	System.out.println("After Class");
}
@BeforeTest
public void beforetest() {
	System.out.println("Before test");
}
@AfterTest
public void aftertest() {
	System.out.println("After test");
}
@BeforeSuite
public void beforesuite() {
	System.out.println("Before suite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("After suite");
}
}
//end
	


