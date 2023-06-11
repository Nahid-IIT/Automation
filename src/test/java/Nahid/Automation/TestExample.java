package Nahid.Automation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestExample {

	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void aftereSuiteTest() {
		System.out.println("AfterSuite");
	}
	
	@Test
	public void firstTest()
	{
		System.out.println("This is First Test");
	}
}
