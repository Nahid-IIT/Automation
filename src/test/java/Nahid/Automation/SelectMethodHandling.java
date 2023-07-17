package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BaseDriver {
	String url = "https://www.amazon.com/";
	
	@Test
	public void selectMethodHandlingTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement searchDropBox = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select   = new Select(searchDropBox);
		
		// Search by index
		select.selectByIndex(4);
		Thread.sleep(2000);
		//search by Value
		select.selectByValue("search-alias=deals-intl-ship");
		Thread.sleep(3000);
		
		//Search by visual Text
		select.selectByVisibleText("Software");
		Thread.sleep(3000);
		
		
	}

}
