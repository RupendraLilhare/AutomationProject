package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_9 extends BaseClass2 {
	
	
	@Test
	public void testCase9() throws InterruptedException
	{
		 
		WebElement userRegisterPage=driver.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']"));
		userRegisterPage.click();
		 
		WebElement singUP=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']"));
		
		 singUP.click();
		String errorTextSignUp=driver.findElement(By.xpath("//android.widget.TextView[@text='Error while signup']")).getText();
		
		System.out.println(errorTextSignUp);
		Assert.assertEquals(errorTextSignUp,"Error while signup");
		
		WebElement ok=driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
		
		ok.click();
		
	}
	


}
