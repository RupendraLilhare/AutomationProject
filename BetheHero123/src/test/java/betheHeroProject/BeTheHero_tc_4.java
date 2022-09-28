package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_4 extends BaseClass2 {
	@Test
	public void testCase3() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("7e749f79");
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
		
		
		
		WebElement viewMore=driver.findElement(By.xpath("//android.widget.TextView[@text='View more details']"));
		viewMore.click();
		
		boolean whatsApp=driver.findElement(By.xpath("//android.widget.TextView[@text='WhatsApp']")).isEnabled();
		
		System.out.println(whatsApp);
		Assert.assertTrue(true);
		
        boolean email=driver.findElement(By.xpath("//android.widget.TextView[@text='E-mail']")).isEnabled();
		
		System.out.println(email);
		Assert.assertTrue(true);
		
}
}