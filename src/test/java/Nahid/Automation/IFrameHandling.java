package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameHandling extends BaseDriver {
  
	String url =  "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void frameTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeNumber);
		
		driver.switchTo().frame("packageListFrame");
		WebElement iframe = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		iframe.click();
		Thread.sleep(2000);
		
		// ekta frame er kaj ses hole default e patha te hbe
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		WebElement alert = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		alert.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		
		WebElement getText = driver.findElement(By.xpath("//h4[contains(text(),'getText')]"));
		getText.click();
		Thread.sleep(2000);
		
		
	}
	
}
