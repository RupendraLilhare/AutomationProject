package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ScrollANDslidetask_Emulator {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"ASUS_X00TD");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		//dc.setCapability("AVD","Pixel_4_API_30")
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.settings");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.settings.Settings");
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView[1]")).click();
	   

		WebElement  switch_ele1=(WebElement) driver.findElements(By.id("android:id/title")).get(5);
		 switch_ele1.click();
		
		
		WebElement  switch_ele=driver.findElement(By.id("android:id/switch_widget"));
		if(switch_ele.isDisplayed())
		{
			switch_ele.click();
		}
		
		WebElement barele=driver.findElement(By.xpath("//android.widget.SeekBar[@content-desc=\"Media volume\"]"));
		
		TouchAction ac=new TouchAction(driver);
		
		//Thread.sleep(3000);
		ac.longPress(ElementOption.element(barele)).moveTo(ElementOption.element(barele,180,347)).release().perform();
			driver.navigate().back();
			
			Set<String> contextNames=driver.getContextHandles();
			
			for(String contextName:contextNames)
			{
				System.out.println(contextNames);
			}
		
		//scrooling down method 1
	  // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Google\"));"));
      // WebElement google_ele=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.TextView[1]"));
	
		
     //  google_ele.click();
       
       
       //scroolling Method 2
       
     AndroidElement  list_ele=(AndroidElement) driver.findElement(By.id("android:id/title"));
		
		MobileElement litem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+ "new UiSelector().text(\"Google\"));"));
		
}
	}