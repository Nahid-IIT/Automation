package Nahid.Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitHandling  extends BaseDriver {

	String url ="https://www.shohoz.com/en";
	
	@Test
	public void waitTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		//implicitwait
	   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//explcit
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement bus = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[1]/ol[1]/li[1]/a[1]")));
        bus.click();
        Thread.sleep(3000);
	}
}
