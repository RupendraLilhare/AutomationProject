package Mobile.AutomationProject;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TacksScreenShot {
	
	public static void main() throws IOException {
	
	DesiredCapabilities dc=new DesiredCapabilities();

	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redme Note 9");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.settings");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.settings.Settings");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	try {
		WebElement soundElement = driver.findElement(By.name("xyz"));
		soundElement.click();
	} 
	catch (Exception e) 
	{
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\QQA0464\\eclipse-workspace\\AutomationProject\\target"));
	}
}
}