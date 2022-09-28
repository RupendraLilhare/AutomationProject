package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Nativeapptest_emulator {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		dc.setCapability("avd","Pixel_4_API_30");
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.calculator");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  
			//WebElement ele_agree= driver.findElement(By.id("android:id/button1"));
			//ele_agree.click();
			WebElement ele_6= driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
			ele_6.click();
			
		    WebElement ele_add= driver.findElement(By.id("com.google.android.calculator:id/op_add"));
			ele_add.click();
			
			WebElement ele_4= driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
			ele_4.click();
			
			WebElement ele_equal = driver.findElement(By.id("com.google.android.calculator:id/eq"));
			ele_equal.click();
			
			WebElement ele_result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
			String result=ele_result.getText();
			System.out.println("result is :"+ result);
			

	}

}
