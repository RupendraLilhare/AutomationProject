package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_3 extends BaseClass2{

	

	@Test
	public void testCase3() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("cad24c7d");//cad24c7d , 7e749f79 ,9b20df30 , de96f77d
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
	
		WebElement addCase=driver.findElement(By.xpath("//android.widget.TextView[@text='Add Case']"));
		addCase.click();
		
		WebElement title=driver.findElement(By.xpath("//android.widget.EditText[@text='Give title']"));
				
		title.sendKeys("current account");
		

		WebElement description=driver.findElement(By.xpath("//android.widget.EditText[@text='Give description']"));
				
		description.sendKeys("add amaount");

		WebElement value=driver.findElement(By.xpath("//android.widget.EditText[@text='Give value']"));
				
		value.sendKeys("3000");
		
		WebElement caase=driver.findElement(By.xpath("//android.widget.TextView[@text='ADD CASE']"));
		
		caase.click();
		
		
        String titalValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='current account']")).getText();
		
		System.out.println(titalValidate);
		Assert.assertEquals(titalValidate,"current account");
		
        String descriptionValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='add amaount']")).getText();
		
		System.out.println(descriptionValidate);
		Assert.assertEquals(descriptionValidate,"add amaount");
		
       String valueValidate=driver.findElement(By.xpath("//android.widget.TextView[@text='R$3.000,00']")).getText();
		
		System.out.println(valueValidate);
		Assert.assertEquals(valueValidate,"R$3.000,00");
		
		String totaly2Cases=driver.findElement(By.xpath("//android.widget.TextView[@text='Totally 2 cases.']")).getText();
		System.out.println(totaly2Cases);
		Assert.assertEquals(totaly2Cases,"Totally 2 cases.");
		
}
}