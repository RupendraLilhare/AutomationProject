package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HandleCallender {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc=new DesiredCapabilities();
		//File f=new File("src");
		//File file=new File(f,"com.touchboarder.android.api.demos_2016-02-08.apk");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\QQA0464\\Downloads\\com.touchboarder.android.api.demos_2016-02-08.apk");
		//dc.setCapability("AVD","Pixel_4_API_30")
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

		//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.settings");
		//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.settings.Settings");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement demo_ele=(WebElement) driver.findElements(By.id("android:id/text1")).get(1);
		
		demo_ele.click();
		
		WebElement view_ele=(WebElement) driver.findElements(By.id("android:id/text1")).get(12);
		view_ele.click();
		
		WebElement date_ele=(WebElement) driver.findElements(By.id("android:id/text1")).get(6);
		date_ele.click();
		
		WebElement diloge_ele=(WebElement) driver.findElements(By.id("android:id/text1")).get(0);
		diloge_ele.click();
		
		
		WebElement change_ele=driver.findElement(By.id("com.touchboarder.android.api.demos:id/pickDate"));
		change_ele.click();
		
		String year="2023";
		String month="May";
		String Date="13";
		
	String datemonth=driver.findElement(By.id("android:id/next")).getText();
	
	System.out.println(datemonth);
		
	}

}
