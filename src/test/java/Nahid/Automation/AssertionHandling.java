package Nahid.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionHandling extends BaseDriver {
	String url ="https://www.shohoz.com/en";
	
	@Test
	public void testAssertion() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		String expectedTitle ="Bangladesh's Largest Online Ticket Destination | Shohoz";
		String actualTitle  = driver.getTitle();
		
		//Hard Assertions
		//Assert.assertEquals(actualTitle,expectedTitle);
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Pass");
	    soft.assertAll();
		
		
	}

}
