import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		//When running a program on a remote device ,here it is an emulator
		DesiredCapabilities cap =  new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME , "vidya Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//this is not mandatory, for IOS this is mandate automation_name 
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		//these are specific capabilities
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Sprint\\Installables\\chromedriver_win32\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			return driver;
	}
}


