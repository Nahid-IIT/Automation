package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementExample extends BaseDriver {
	
	String url = "https://demoqa.com/automation-practice-form";
	
    @Test
	public void webElementTest() throws InterruptedException  {
	
	driver.manage().window().maximize();
	driver.get(url);	
	
	
	//First Name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Nahibl");
		Thread.sleep(3000);
		firstName.clear();
		firstName.sendKeys("Nahidul Islam");
		
	
	
	//LastName
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Islam");
		Thread.sleep(3000);
	
	//Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("nahid@gmail.com");
		Thread.sleep(3000);
		
	    System.out.println("Attribute = " + email.getAttribute("placeholder"));
		
		
	//Mobile
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("01934538054");
		Thread.sleep(3000);	

	//Date of Birth
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		Thread.sleep(3000);
		
		
	
	
}
	
}
