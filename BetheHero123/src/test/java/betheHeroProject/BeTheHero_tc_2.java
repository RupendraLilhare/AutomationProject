package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_2 extends BaseClass2 {
	
	@Test
	public void testCase2() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("cad24c7d");//cad24c7d , 7e749f79 ,9b20df30, de96f77d
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
	
		WebElement addCase=driver.findElement(By.xpath("//android.widget.TextView[@text='Add Case']"));
		addCase.click();
		
		WebElement title=driver.findElement(By.xpath("//android.widget.EditText[@text='Give title']"));
				
		title.sendKeys("saving account");
		

		WebElement description=driver.findElement(By.xpath("//android.widget.EditText[@text='Give description']"));
				
		description.sendKeys("add money");

		WebElement value=driver.findElement(By.xpath("//android.widget.EditText[@text='Give value']"));
				
		value.sendKeys("2000");
		
		WebElement caseAd=driver.findElement(By.xpath("//android.widget.TextView[@text='ADD CASE']"));
		
		caseAd.click();
		
		
		String titalValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='saving account']")).getText();
		
		System.out.println(titalValidate);
		Assert.assertEquals(titalValidate,"saving account");
		
        String descriptionValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='add money']")).getText();
		
		System.out.println(descriptionValidate);
		Assert.assertEquals(descriptionValidate,"add money");
		
        String valueValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='R$2.000,00']")).getText();
		
		System.out.println(valueValidate);
		Assert.assertEquals(valueValidate,"R$2.000,00");
		String totaly1Cases=driver.findElement(By.xpath("//android.widget.TextView[@text='Totally 1 cases.']")).getText();
		System.out.println(totaly1Cases);
		Assert.assertEquals(totaly1Cases,"Totally 1 cases.");
		
}
}