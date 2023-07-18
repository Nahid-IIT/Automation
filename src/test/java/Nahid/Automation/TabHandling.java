package Nahid.Automation;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandling  extends BaseDriver{
	
	String url1= "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html ";
	String url2 = "https://demoqa.com/automation-practice-form ";
	
	@Test
	public void tabHandleTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url1);
		Thread.sleep(5000);
		
		String orginalTab = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(url2);
		Thread.sleep(5000);
		
		driver.switchTo().window(orginalTab);
		Thread.sleep(5000);
		
		
	}

}
