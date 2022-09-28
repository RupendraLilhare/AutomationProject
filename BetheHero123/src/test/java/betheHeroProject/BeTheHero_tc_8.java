package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_8 extends BaseClass2 {

	@Test
	public void testCase8() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("h5t6sgydg");
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
		
		
		String errorText1=driver.findElement(By.xpath("//android.widget.TextView[@text='Error while signin']")).getText();
		System.out.println(errorText1);
		Assert.assertEquals(errorText1,"Error while signin");
	
	WebElement ok=driver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
	
	 ok.click();
}
}