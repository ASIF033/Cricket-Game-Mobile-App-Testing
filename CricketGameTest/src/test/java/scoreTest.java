
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;




public class scoreTest {
	static AppiumDriver<MobileElement> driver;
	public static void main(String[] args)
	{
		try {
			openGame();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	public static void openGame() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("deviceName","Galaxy A52" );
		cap.setCapability("udid","RZ8T1172HBB" );
		cap.setCapability("platformName", "Android" );
		cap.setCapability("platformVersion", "13" );
		cap.setCapability("appPackage", "com.mojargames.cricket" );
		cap.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity" );
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application started...");
		
		MobileElement start=  driver.findElement(By.id("com.mojargames.cricket:id/unitySurfaceView"));
		start.click();
		
		
		
	}
}
