package stepdefinations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.PropertiesReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AppiumDriver driver;

    public void setUp() throws MalformedURLException {


        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        caps.setCapability(MobileCapabilityType.UDID, "53a3a792");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 5");
        caps.setCapability("appPackage", "com.whatsapp");
        caps.setCapability("appActivity", "com.whatsapp.Main");
        caps.setCapability(MobileCapabilityType.NO_RESET,true);
        caps.setCapability(MobileCapabilityType.FULL_RESET,false);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AppiumDriver(new URL(PropertiesReader.getProperty("config", "Appium_hub")), caps);
    }

    public void tearDown(){
        driver.quit();
    }

}
