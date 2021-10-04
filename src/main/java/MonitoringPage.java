import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitoringPage {

    public MonitoringPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Карта Google\"])[2]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement googleMap;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement month;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement date;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.TextView[8]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement day;

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement fullCalendar;

    @AndroidFindBy(id = "native.calendar.DAY_NAMES-undefined_1632899997846")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement fullCalendarDays;

}
