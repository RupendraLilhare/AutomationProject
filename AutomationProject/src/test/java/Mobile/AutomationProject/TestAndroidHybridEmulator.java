package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAndroidHybridEmulator {
	public static void main(String[]args) throws MalformedURLException
	{
	DesiredCapabilities dc= new DesiredCapabilities(); 
	  dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
      dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability("avd","Pixel_4_API_30");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.asus.calculator");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.asus.calculator.Calculator");
		
		 
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//WebElement ele_agree= driver.findElement(By.id("android:id/button1"));
		//ele_agree.click();
		//WebElement ele_6= driver.findElement(By.id("com.asus.calculator:id/digit6"));
		//ele_6.click();
		
	    //WebElement ele_add= driver.findElement(By.id("com.asus.calculator:id/plus"));
		//ele_add.click();
		
}
}