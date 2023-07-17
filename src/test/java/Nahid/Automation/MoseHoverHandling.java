package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoseHoverHandling extends BaseDriver {
	String url = "https://www.daraz.com.bd/";
	
	@Test
	public void mouseHoverHandlingTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement groceries  = driver.findElement(By.xpath("//span[contains(text(),'Groceries')]"));
		action.moveToElement(groceries).perform();
		Thread.sleep(5000);
		
		WebElement fruits = driver.findElement(By.xpath("//span[contains(text(),'Fruits, Meat & Frozen')]"));
		action.moveToElement(fruits).perform();
		Thread.sleep(5000);
		
		WebElement dates = driver.findElement(By.xpath("//span[contains(text(),'Dates')]"));
		dates.click();
		Thread.sleep(5000);
	}

}
