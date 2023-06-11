package Nahid.Automation;

import org.testng.annotations.Test;

public class B extends A{

	@Test
	public void firstTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://docs.google.com/document/d/1JPIyZoh0gs2H3ZvGGSXQJa8tlnzt9iW3ML_CPpg3iO4/edit");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	
}
