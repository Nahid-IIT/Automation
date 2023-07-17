package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPasteHandling extends BaseDriver {
	
	String  url  = "https://demoqa.com/automation-practice-form";
	@Test
	public void copyPasteTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		Actions action  = new Actions(driver);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Nahidul");
		
		WebElement lastName  = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		//Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("A");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("C");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		//Tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		Thread.sleep(2000);
		
		//Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("V");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		
	}
	

}