package Nahid.Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample extends BaseDriver {
	String url ="https://www.shohoz.com/en";
	@Test
	public void testAssertion() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//ImplicitWait eta ekhn r proyojon hoy na 
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//ExplicitWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement bus = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[1]/ol[1]/li[1]/a[1]")));
		
}
}
