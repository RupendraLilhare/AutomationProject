package betheHeroProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;
import io.appium.java_client.MobileBy;

public class BeTheHero_tc_1 extends BaseClass2{
	
	@Test
	public void SignUp() throws InterruptedException
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
		
		WebElement stateCode=driver.findElement(By.xpath("//android.widget.EditText[@text='State code']"));
		 stateCode.sendKeys("44");
		 WebElement singUP=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']"));
			
		 singUP.click(); 
		 
		String sucsses= driver.findElement(By.id("android:id/alertTitle")).getText();
		
		System.out.println(sucsses);
	
		driver.findElement(By.xpath("//android.widget.Button[@text='OK. SIGNIN']")).click();
		
		
	    String dasboardName=driver.findElement(By.xpath("//android.widget.TextView[@text='Rupendra']")).getText();
	    System.out.println(dasboardName);
	   
	    Assert.assertEquals(dasboardName,"Rupendra");
	   
	    WebElement account=driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));
	   
		account.click();
		Thread.sleep(3000);
		
		WebElement back=driver.findElement(By.xpath("//android.widget.TextView[@index='1']"));
		back.click();
		//driver.navigate().back();
		
		
		WebElement logOut=driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
		
		logOut.click();
		
	
}
		
	
}

	
	
	
	
	


