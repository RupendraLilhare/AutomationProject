package basePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass2 {
	
	public AndroidDriver driver;
	
	
	 @BeforeMethod
		public void ConfigureAppium() throws MalformedURLException
		{


		DesiredCapabilities dc= new DesiredCapabilities(); 
		    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
			
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\QQA0464\\Downloads\\bethehero-e6a0e97abde44a01b286c0a340a3e513-signed.apk");
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.robinqapitol.bethehero");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "host.exp.exponent.LauncherActivity");
				
			driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
				
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
			/*@AfterMethod
			public void close()
		{
			driver.quit();
		}*/
			
	
	

}
