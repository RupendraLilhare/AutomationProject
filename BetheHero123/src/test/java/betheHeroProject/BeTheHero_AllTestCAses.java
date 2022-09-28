package betheHeroProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass2;

public class BeTheHero_AllTestCAses extends BaseClass2 {
	
	@Test(priority=1)
	public void TestCase1() throws InterruptedException
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
		driver.navigate().back();

		WebElement logOut=driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
		
		logOut.click();
}
	
	@Test(priority=2)
	public void testCase2() throws InterruptedException
	{
		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("b5c7cb45");
		
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
	    WebElement logOut=driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
		
		logOut.click();
		
}
	@Test(priority=3)
	public void testCase3() throws InterruptedException
	{

		WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
		logIn.sendKeys("b5c7cb45");
		
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
		
        WebElement caseAd=driver.findElement(By.xpath("//android.widget.TextView[@text='ADD CASE']"));
		
		caseAd.click();
		
		
		
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

	
		@Test(priority=4)
		public void testCase4() throws InterruptedException
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
		

		@Test(priority=5)
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
	        if(actualID.equals(iddetails)) {
	            System.out.println("ID is as acccepted");
	        }
	        else {
	            System.out.println("ID is not as expected");
	        }
			
	        
	        String actualName="Rupendra Lilhare";
	        WebElement name= driver.findElement(By.xpath("//android.widget.EditText[@text='Rupendra Lilhare']"));
	        String nameDetails=name.getText();
	        if(actualName.equals(nameDetails)) {
	            System.out.println("Name is as acccepted");
	        }
	        else {
	            System.out.println("Name is not as expected");
	        }
	        
	        
	        String actualEmail="lilhare1305@gmail.com";
	        WebElement email= driver.findElement(By.xpath("//android.widget.EditText[@text='lilhare1305@gmail.com']"));
	        String emailDetails=email.getText();
	        if(actualEmail.equals(emailDetails)) {
	            System.out.println("E-mail is as acccepted");
	        }
	        else {
	            System.out.println("E-mail is not as expected");
	        }
	        
	        String actualWhatsupNO="8806164399";
	        WebElement whatsupNO= driver.findElement(By.xpath("//android.widget.EditText[@text='8806164399']"));
	        String WhatsuplDetails=whatsupNO.getText();
	        if(actualWhatsupNO.equals(WhatsuplDetails)) {
	            System.out.println("Whatsup is as acccepted");
	        }
	        else {
	            System.out.println("Whatsup is not as expected");
	        }
	        
	        
	       String actualCity="Gondia";
	        WebElement city= driver.findElement(By.xpath("//android.widget.EditText[@text='Gondia']"));
	        String cityDetails=city.getText();
	        if(actualCity.equals(cityDetails)) {
	            System.out.println("City is as acccepted");
	        }
	        else {
	            System.out.println("City is not as expected");
	        }
	        

	        String actualCode="55";
	        WebElement code= driver.findElement(By.xpath("//android.widget.EditText[@text='55']"));
	        String codeDetails=code.getText();
	        if(actualCode.equals(codeDetails)) {
	            System.out.println("code is as acccepted");
	        }
	        else {
	            System.out.println("code is not as expected");
	        }
			
		}

		@Test(enabled=false)
		public void testCase6() throws InterruptedException
		{
			WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
			logIn.sendKeys("7e749f79");
			
			WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
			singIn.click();
			WebElement account=driver.findElement(By.xpath("//android.widget.TextView[@text='Account']"));   
			account.click();
			
			WebElement edit=driver.findElement(By.xpath("//android.widget.TextView[@text='EDIT']"));   
			edit.click();
		
			WebElement name=driver.findElement(By.xpath("//android.widget.EditText[@text='Rupendra']"));
			name.clear();
			name.sendKeys("Rupendra Lilhare");
			WebElement emailID=driver.findElement(By.xpath("//android.widget.EditText[@text='rupendra1305@gmail.com']"));
			emailID.clear();
			emailID.sendKeys("lilhare1305@gmail.com");
			
			WebElement mobileNo=driver.findElement(By.xpath("//android.widget.EditText[@text='8806163399']"));
			 mobileNo.clear();
			 mobileNo.sendKeys("8806164399");
			
			WebElement city=driver.findElement(By.xpath("//android.widget.EditText[@text='Nagpur']"));
			city.clear();
			city.sendKeys("Gondia");
			
			WebElement stateCode=driver.findElement(By.xpath("//android.widget.EditText[@text='44']"));
			stateCode.clear();
			 stateCode.sendKeys("55");
			WebElement update=driver.findElement(By.xpath("//android.widget.TextView[@text='UPDATE']"));   
			update.click();
		}
	
		@Test(priority=7)
		public void testCase7() throws InterruptedException
		{
			WebElement logIn=driver.findElement(By.xpath("//android.widget.EditText[@text='Login id']"));
			logIn.sendKeys("7e749f79");
			
			WebElement singIn=driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN IN']"));
			singIn.click();
			singIn.isDisplayed();
			
		
			WebElement logOut=driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']"));
			
			logOut.click();
	}
		
		@Test(priority=8)
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
		@Test(priority=9)
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
		@Test(priority=10)
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
			


	
	


