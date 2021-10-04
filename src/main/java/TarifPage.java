import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class TarifPage {

    public TarifPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text, '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement backArrow;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Тариф')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement tarifHeaderText;

    @AndroidFindBy(xpath = "//*[contains(@text, '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carNameText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Подробнее о модели')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement aboutModelText;

    @AndroidFindBy(xpath = "//*[contains(@text, '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.ImageView')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carImg;

    @AndroidFindBy(xpath = "//*[contains(@text, '12 месяцев')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement month12text;

    @AndroidFindBy(xpath = "//*[contains(@text, 'FULL')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement fullTarif;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Месячный лимит\n')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement monthLimitText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Месячный лимит\n')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement monthLimitValueText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сверх лимита\n')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement overLimitText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Месячный лимит\n')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement overLimitValueText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Продолжить')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement priceText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement lightTarif;

    // calendar for start sub
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement calendarBackArrow;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement calendarHeader;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement month;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement year;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement days;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement dayForClick;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement dateStartSub;
    @AndroidFindBy(xpath = "//*[contains(@text, 'LIGHT')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement chooseButton;

}
