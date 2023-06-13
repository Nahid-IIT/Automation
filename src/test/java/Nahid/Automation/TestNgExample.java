package Nahid.Automation;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample {

	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void aftereSuiteTest() {
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Methodt");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@Test(priority = 1)
	public void secondTest() {
		System.out.println("This is second Test");
	}
	
	@Test(priority = 0)
	public void firstTest() {
		System.out.println("This is first Test");
	}
}
