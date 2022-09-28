package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_10 extends BaseClass2{
	
	@Test
	public void testCase10()
	{
		WebElement userRegisterPage=driver.findElement(By.xpath("//android.widget.TextView[@text='New User - Sign Up']"));
		userRegisterPage.click();
		
		WebElement name=driver.findElement(By.xpath("//android.widget.EditText[@text='Name']"));
		name.sendKeys("Rupendra");
		driver.hideKeyboard();
		WebElement emailID=driver.findElement(By.xpath("//android.widget.EditText[@text='Email']"));
		emailID.sendKeys("rupendra1305@gmail.com");
		
		WebElement mobileNo=driver.findElement(By.xpath("//android.widget.EditText[@text='Mobile']"));
		 mobileNo.sendKeys("8806163399");
		
		WebElement city=driver.findElement(By.xpath("//android.widget.EditText[@text='City']"));
		city.sendKeys("Nagpur");
		
		WebElement invalidstateCode=driver.findElement(By.xpath("//android.widget.EditText[@text='State code']"));
		 invalidstateCode.sendKeys("442");
		 WebElement singUP=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']"));
			
		 singUP.click();
		 
		String errorText=driver.findElement(By.xpath("//android.widget.TextView[@text='Error while signup']")).getText();
		
		System.out.println(errorText);
		Assert.assertEquals(errorText,"Error while signup");
		
		WebElement ok=driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
		
		 ok.click();
		
	}
	

}
