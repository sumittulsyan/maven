package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public  AppiumDriver<MobileElement> driver ;
//	public static Properties prop;
	
//	public TestBase() {
//		
//		try 
//		{
//			prop=new Properties();
//			FileInputStream fis=new FileInputStream("/Users/sumittulsyan/eclipse-workspace/TaxiApp/src/main/java/com/qa/config/config.properties");
//			prop.load(fis);
//			
//			
//		}
//		catch(IOException e)	
//		
//		{
//			e.getMessage();
//
//}
//}
	
	public void initaction() throws MalformedURLException
	{
	         DesiredCapabilities cap =new DesiredCapabilities();
	        cap.setCapability("app","/Users/sumittulsyan/Downloads/app-release (1).apk");
	        cap.setCapability("deviceName","emulator-5554");
	        cap.setCapability("platformName","android");
	        cap.setCapability("platformVersion","7");
	        cap.setCapability("automationName","uiautomator2");
	        
	        cap.setCapability("appPackage","io.nativebase.market.geekyants.taxiapprider");
	        cap.setCapability("appActivity","io.nativebase.market.geekyants.taxiapprider.MainActivity");
	      //  cap.setCapability("ignoreUnimportantViews","true");
	        //cap.setCapability("normalizeTagNames","true");
	       // cap.setCapability("waitForQuiescence", false);
	        //cap.setCapability("shouldUseSingletonTestManager",false);
	      //  cap.setCapability("newCommandTimeout",5000);
	        //cap.setCapability("uiautomator2ServerLaunchTimeout","20000");
	       // cap.setCapability("skipDeviceInitialization",true);
	        //cap.setCapability("skipServerInstallation",true);
	       // cap.setCapability("disableAndroidWatchers","true");
        // cap.setCapability("autoGrantPermission",true);
 	    cap.setCapability(MobileCapabilityType.NO_RESET, false);
 	    //caps.setCapability("waitForQuiescence", false);
 	   driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();
	
}
}

