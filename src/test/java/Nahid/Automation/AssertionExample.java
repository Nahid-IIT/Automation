package Nahid.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class AssertionExample extends BaseDriver {
	
	@Test
	public void testAssertion() throws InterruptedException {
		String url ="https://www.shohoz.com/en";
		driver.get(url);
		driver.manage().window().maximize();
		String expectedTitle ="Bangladesh's Largest Online Ticket Destination | Shohoz";
		String actualTitle  = driver.getTitle();
		Thread.sleep(3000);
		
		//Hard Assertions
		//Assert.assertEquals(expectedTitle, actualTitle);
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualTitle, expectedTitle);
		
		
		System.out.println("Pass");
	soft.assertAll();
		
		
	}

}
