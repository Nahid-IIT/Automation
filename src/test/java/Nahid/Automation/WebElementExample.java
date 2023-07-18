package Nahid.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		lastName.clear();
		lastName.sendKeys("Islam");
		Thread.sleep(3000);
	
	//Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		if(email.isDisplayed()) {
			email.sendKeys("nahid@gmail.com");
			Thread.sleep(3000);
		}else {
			System.out.print("Unlocatable");
		}
		
	    System.out.println("Attribute = " + email.getAttribute("placeholder"));
		
		
	//Mobile
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("01934538054");
		Thread.sleep(3000);	
		
//		//Subject
//		WebElement subject = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
//		subject.sendKeys("IIT-JU");
//		Thread.sleep(3000);
		
		
	//Get Text
		WebElement text= driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		System.out.println(text.getText());

		
		//Checkbox
		WebElement sport= driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		
		if(!sport.isSelected()) {
			sport.click();
			Thread.sleep(3000);
		}else {
			System.out.print("Already Selsected");
		}
		
		//RadioButton
		WebElement female= driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		if(!female.isSelected()) {
			female.click();
			Thread.sleep(3000);
		}else {
			System.out.print("Already Selsected");
		}
	//Date of Birth
     	WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		Thread.sleep(3000);
		
		//Current Address
		//Mobile
		WebElement currentAddress = driver.findElement(By.xpath("///textarea[@id='currentAddress']"));
		currentAddress.sendKeys("Naria\nShariatpur\nDhaka\nBangladesh");
		Thread.sleep(3000);
		
	
//		//Select Option
//		WebElement selectBox = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
//		Select select  = new Select(selectBox);
//		//select.selectByVisibleText("Hariyana");
//		select.selectByIndex(1);
//		Thread.sleep(3000);
//		

}
	
}
