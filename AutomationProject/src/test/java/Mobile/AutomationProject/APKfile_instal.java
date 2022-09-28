package Mobile.AutomationProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class APKfile_instal {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		// File fs=new File("src/main/java/utilities");
		//File file=new File(fs,"Google Calculator_8.2 (453324893)_apkcombo.com.apk");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redme Note 9");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		//dc.setCapability("avd","Pixel_4_API_30");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\QQA0464\\Downloads\\bethehero-e6a0e97abde44a01b286c0a340a3e513-signed.apk");
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		
		driver.findElement(By.xpath("/android.widget.TextView"))
		
		
		

	}

}
