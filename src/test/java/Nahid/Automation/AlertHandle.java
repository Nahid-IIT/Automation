package Nahid.Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandle  extends BaseDriver {

	String url = "https://demoqa.com/alerts";
	
	@Test
	public void alertTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
//		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
//		alertButton.click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(3000);
		
//		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		confirmButton.click();
//		Thread.sleep(3000);
//		
//		Alert alert2 = driver.switchTo().alert();
//		alert2.accept();
//		Thread.sleep(3000);
//		
//		WebElement confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']"));
//		System.out.println(confirmResult.getText());
//		Thread.sleep(3000);
		
		WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptButton.click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is Nahidul Islam");
		alert.accept();
		Thread.sleep(3000);
		
		WebElement promptText = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(promptText.getText());
		Thread.sleep(3000);
	
	}
	
			
	
}
