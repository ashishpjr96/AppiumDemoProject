package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

@Test
public class BaseClass {

	 AppiumDriver driver;
	
	@BeforeTest
	public void setup()  {
		
		try {
		DesiredCapabilities caps= new DesiredCapabilities();
		//caps.setCapability("platfonName", "Android");
		caps.setCapability(CapabilityType.PLATFORM_NAME,"Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsungTab");
		caps.setCapability(MobileCapabilityType.UDID,"");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//	caps.setCapability(MobileCapabilityType.APP, "");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
        
        URL url= new URL ("http://127.0.0.1:4723/wd/hub");
        driver=new AppiumDriver<MobileElement>(url,caps);
	}catch(Exception e)
		
	{
		System.out.println("the cause is"+e.getCause());
		System.out.println("Message is" +e.getMessage());
		e.printStackTrace();
	}
	}public void sampleTest() {
			System.out.println("inside sample test");
		
	} 
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
}
