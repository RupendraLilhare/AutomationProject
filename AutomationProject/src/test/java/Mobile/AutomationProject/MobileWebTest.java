package Mobile.AutomationProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class MobileWebTest {

	public static void main(String[]args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"ASUS_X00TD");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		
 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		 
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://m.facebook.com/login");
		
		//WebElement email= driver.findElement(By.id("m_login_password"));
		// email.sendKeys("7532356");
		 
			//WebElement password= driver.findElement(By.xpath("//button[@name=\"login\"]")); 
			//password.sendKeys("jdgjg");
		//	Thread.sleep(3000);
		//	driver.quit();
          WebElement creatnewacc_ele=driver.findElement(By.id("signup-button"));
		  
          creatnewacc_ele.click();		 
		 WebElement firstname_ele=driver.findElement(By.id("firstname_input"));
		 
		 firstname_ele.clear();
		 firstname_ele.sendKeys("Rupendra");
		 
 WebElement lastname_ele=driver.findElement(By.xpath("//input[@id='lastname_input'][1]"));
		 
		 lastname_ele.clear();
		 lastname_ele.sendKeys("lilhare");
	

		 WebElement next_ele=driver.findElement(By.xpath("//button[@type='submit'][1]"));
		 next_ele.click();
		 
		//select[@id='day']
		 

		 WebElement day_ele=driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select sl=new Select(day_ele);
		 sl.selectByVisibleText("21");
		 
		WebElement moonth_ele=driver.findElement(By.id("month"));
		Select selectmonth=new Select(moonth_ele);
		selectmonth.selectByVisibleText("May");
			
		WebElement year_ele=driver.findElement(By.id("year"));
		Select selectyear=new Select(year_ele);
		selectyear.selectByVisibleText("1995");
		
		WebElement next_button=driver.findElement(By.xpath("//button[@value='Next'][1]"));
		next_button.click();
		
		//WebElement age_ele=driver.findElement(By.xpath("//input[@name='age_step_input']"));
		//age_ele.clear();
		//age_ele.sendKeys("23");
		
		//WebElement next_button1=driver.findElement(By.xpath("//button[@value='Next'][1]"));
		//next_button1.click();
		
		//input[@id='contactpoint_step_input'][1]
		
		WebElement phonno_ele=driver.findElement(By.xpath("//input[@id='contactpoint_step_input'][1]"));
		phonno_ele.clear();
		phonno_ele.sendKeys("6575757575");
		
		WebElement next_button1=driver.findElement(By.xpath("//button[@value='Next'][1]"));
		next_button1.click();
		
		
		WebElement gender_ele=driver.findElement(By.xpath("//input[@id='Male']"));
		gender_ele.click();
		
		WebElement next_button2=driver.findElement(By.xpath("//button[@value='Next'][1]"));
		next_button2.click();
		
			
	}
	}

