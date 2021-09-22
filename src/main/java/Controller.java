import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Controller {

    public static OS executionOS = OS.IOS;

    public enum OS {
        ANDROID,
        IOS
    }
    public static Controller instance = new Controller();

    public AppiumDriver driver;

    @BeforeMethod
    public void start() throws MalformedURLException {

        String IOS_APP_PATH = System.getenv("IOS_APP_PATH");

        if (driver != null) {
            return;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch(executionOS){
            case ANDROID:
                capabilities.setCapability("autoGrantPermissions", "true");
                capabilities.setCapability("no-reset", "true");
                capabilities.setCapability("fullReset", "false");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", "10");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("appPackage", "com.hyundai.one");
                capabilities.setCapability("appActivity", "com.hyundai.one.MainActivity");
                capabilities.setCapability("systemPort", "8200");
                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case IOS:
                capabilities.setCapability("autoGrantPermissions", "true");
                capabilities.setCapability("autoAcceptAlerts", "true");
                capabilities.setCapability("fullReset", "false");
                capabilities.setCapability("no-reset", "true");
                capabilities.setCapability("platformName", "ios");
                capabilities.setCapability("deviceName", "iPhone 11");
                capabilities.setCapability("platformVersion", "iOS 15.0");
                capabilities.setCapability("udid", "99CE5FCC-C63E-44C2-A29E-CDABFBB3E9D3");
                capabilities.setCapability("xcodeOrgId", "DY2WBTAT33");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("bundleID", "com.hyundai.one");
                capabilities.setCapability("app", IOS_APP_PATH);
                capabilities.setCapability("language", "rus");
                capabilities.setCapability("systemPort", "8200");
                driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    @AfterMethod
    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
