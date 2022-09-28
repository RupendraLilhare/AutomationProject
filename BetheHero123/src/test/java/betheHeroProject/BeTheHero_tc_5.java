package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_tc_5 extends BaseClass2 {
	
	@Test
	public void testCse5()
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("7e749f79");
		
		WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
		singIn.click();
		WebElement account=driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));   
		account.click();
		
		
		String actualID="7e749f79";
        WebElement id= driver.findElement(By.xpath("//android.widget.EditText[@text='7e749f79']"));
        String iddetails=id.getText();
        Assert.assertEquals(actualID,iddetails);
        
        /*f(actualID.equals(iddetails)) {
            System.out.println("ID is as acccepted");
        }
        else {
            System.out.println("ID is not as expected");
        }*/
		
        
        String actualName="Rupendra Lilhare";
        WebElement name= driver.findElement(By.xpath("//android.widget.EditText[@text='Rupendra Lilhare']"));
        String nameDetails=name.getText();
        Assert.assertEquals(actualName,nameDetails);
        
      /*  if(actualName.equals(nameDetails)) {
            System.out.println("Name is as acccepted");
        }
        else {
            System.out.println("Name is not as expected");
        }*/
        
        
        String actualEmail="lilhare1305@gmail.com";
        WebElement email= driver.findElement(By.xpath("//android.widget.EditText[@text='lilhare1305@gmail.com']"));
        String emailDetails=email.getText();
        Assert.assertEquals(actualEmail,emailDetails);
        
        
        /*if(actualEmail.equals(emailDetails)) {
            System.out.println("E-mail is as acccepted");
        }
        else {
            System.out.println("E-mail is not as expected");
        }*/
        
        String actualWhatsupNO="8806164399";
        WebElement whatsupNO= driver.findElement(By.xpath("//android.widget.EditText[@text='8806164399']"));
        String WhatsuplDetails=whatsupNO.getText();
        Assert.assertEquals(actualWhatsupNO, WhatsuplDetails);
        
        /*if(actualWhatsupNO.equals(WhatsuplDetails)) {
            System.out.println("Whatsup is as acccepted");
        }
        else {
            System.out.println("Whatsup is not as expected");
        }*/
        
        
       String actualCity="Gondia";
        WebElement city= driver.findElement(By.xpath("//android.widget.EditText[@text='Gondia']"));
        String cityDetails=city.getText();
        Assert.assertEquals(actualCity,cityDetails);
        
        /*if(actualCity.equals(cityDetails)) {
            System.out.println("City is as acccepted");
        }
        else {
            System.out.println("City is not as expected");
        }*/
        

        String actualCode="55";
        WebElement code= driver.findElement(By.xpath("//android.widget.EditText[@text='55']"));
        String codeDetails=code.getText();
        Assert.assertEquals(actualCode,codeDetails);
        /*if(actualCode.equals(codeDetails)) {
            System.out.println("code is as acccepted");
        }
        else {
            System.out.println("code is not as expected");
        }*/
		
	}
}
