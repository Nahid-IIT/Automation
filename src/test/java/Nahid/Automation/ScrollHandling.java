package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScrollHandling extends BaseDriver {
String url = "https://www.amazon.com/";
	
	@Test
	public void scrollHandlingTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
     	JavascriptExecutor js = (JavascriptExecutor) driver;	 
        
     	//scroll specific llocation
//        WebElement Element = driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='rhf']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]"));
//        js.executeScript("arguments[0].scrollIntoView(true);", Element);
//		Thread.sleep(3000);
        
       //scroll down
     	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
        //scroll top
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(3000);
		
	}

}



