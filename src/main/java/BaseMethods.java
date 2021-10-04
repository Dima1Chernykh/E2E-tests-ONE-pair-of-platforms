import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseMethods {

    public final String phone = "9265765225";
    public final String confirmCodeDEV = "7288";
//    public final String phone = System.getenv("TESTING_PHONE");
//    public final String confirmCodeDEV = System.getenv("TESTING_DEV_CODE");

    public static String readProperty(String property) {
        Properties prop;
        String value = null;
        try {
            prop = new Properties();
            prop.load(new FileInputStream(new File("config.properties")));

            value = prop.getProperty(property);

            if (value == null || value.isEmpty()) {
                throw new Exception("Value not set or empty");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }

    public static AppiumDriver<?> returnDriver(String platform) throws Exception {

        String IOS_APP_PATH = System.getenv("IOS_APP_PATH");

        AppiumDriver<?> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        switch (platform.toLowerCase()) {

            case "android":
                capabilities.setCapability("autoGrantPermissions", "true");
                capabilities.setCapability("no-reset", "true");
                capabilities.setCapability("fullReset", "false");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", "10");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("automationName", "UiAutomator1");
                capabilities.setCapability("appPackage", "ru.hyundai.one");
                capabilities.setCapability("appActivity", "ru.hyundai.one.MainActivity");

                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            case "ios":
                capabilities.setCapability("autoGrantPermissions", "true");
                capabilities.setCapability("autoAcceptAlerts", "true");
                capabilities.setCapability("no-reset", "true");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "iPhone 11");
                capabilities.setCapability("platformVersion", "iOS 14.4");
                capabilities.setCapability("udid", "5711B7BE-FE76-40C1-A117-96FD78BC6AB4");
                capabilities.setCapability("xcodeOrgId", "DY2WBTAT33");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability("automationName", "XCUITest");
                capabilities.setCapability("bundleID", "com.hyundai.one");
                capabilities.setCapability("app", IOS_APP_PATH);
                capabilities.setCapability("language", "rus");

                driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

            default:
                throw new Exception("Platform not supported");
        }

        return driver;
    }
}
//Запуск
// TESTING_PLATFORM="android" TESTING_PHONE="9265765225" TESTING_DEV_CODE="7288" mvn clean test
//to generate allure report
// allure generate --clean --output allure-results
// allure serve -h localhost
//to restart appium
// adb uninstall io.appium.uiautomator2.server
// adb uninstall io.appium.uiautomator2.server.test
//to find simulator id
// xcrun simctl list | grep Booted
// xcrun simctl list
// instruments -s devices
//to find bundleID
// osascript -e 'id of app ".../Library/Developer/Xcode/DerivedData/Mobikey-aoboaebbptbmibhkbzctthzxbpta/Build/Products/Release-iphonesimulator/Mobikey.app"'
//show taps on simulator
// defaults write com.apple.iphonesimulator ShowSingleTouches 1