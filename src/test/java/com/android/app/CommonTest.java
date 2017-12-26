package com.android.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

/**
 * Супер класс для всех тестов
 */
public class CommonTest {

    /**
     * Драйвер приложения
     */
	protected static AndroidDriver driver;

	/**
     * Инициализация окружения и драйвера
     */
// /*
      @BeforeTest
	public void setUp() throws MalformedURLException {
	 // Created object of DesiredCapabilities class.
   	 DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("deviceName", "X9LDU16226002597");
	 capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	 capabilities.setCapability(CapabilityType.VERSION, "6.0");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("appPackage", "com.intellectokids.academy");
	 capabilities.setCapability("appActivity", "com.unity3d.player.UnityPlayerActivity");
	 
	 driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

	
	@AfterTest
	public void End() {
	 driver.quit();
	}

//  */  
}
