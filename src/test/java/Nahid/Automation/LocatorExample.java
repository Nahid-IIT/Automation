package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {

	@Test
	public void testLocator() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/en");
		Thread.sleep(5000);
		
	//call by id
	//	WebElement  bus = driver.findElement(By.id("purpose"));
	//call by name	
	//	WebElement  bus = driver.findElement(By.name("purpose"));
		
		
		WebElement launch  = driver.findElement(By.linkText("Launch"));
		Thread.sleep(2000);
		launch.click();
		
	}
}
