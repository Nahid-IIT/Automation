package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class LocatorExample_2 extends BaseDriver{
	
	@Test
	public void testLocators() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/en");
		Thread.sleep(2000);
		
		//Call by ID 
		/*WebElement login  = driver.findElement(By.id("w3loginbtn"));
	    login.click();
		Thread.sleep(2000);*/
		
		
		//Call by Class
		WebElement login  = driver.findElement(By.linkText("Bus"));
	    login.click();
		Thread.sleep(2000);
	}

}
