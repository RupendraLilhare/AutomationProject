package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_7 extends BaseClass2 {
	
	@Test
	public void testCase7() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("7e749f79");
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
		
		System.out.println("login Page is display");
		singIn.isDisplayed();
		
	
		WebElement logOut=driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
		
		logOut.click();
}
}
