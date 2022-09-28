package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;

public class Drag_and_Drop_Action {

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities dc=new DesiredCapabilities();

		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"ASUS_X00TD");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\QQA0464\\Downloads\\Drag Drop Multiple domains for awesome brains_v5_apkpure.com.apk");

		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement wc=driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/btn_world_capitals"));
		wc.click();
		
		WebElement source=driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/chooseB"));
		
		WebElement target=driver.findElement(By.id("dragdrop.stufflex.com.dragdrop:id/answer"));
		
		TouchAction ac=new TouchAction(driver);
		
		ac.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		
		
		System.out.println("Drag and Drop Succesfully perform");
	}

}
