import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // menu buttons
    @AndroidFindBy(xpath = "//*[contains(@text, 'Главная')]")
    @iOSXCUITFindBy(accessibility = "Главная, tab, 1 of 5")
    public MobileElement mainButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Мои авто')]")
    @iOSXCUITFindBy(accessibility = "Мои авто, tab, 2 of 5")
    public MobileElement myAutoButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup/android.widget.ImageView')]")
    @iOSXCUITFindBy(accessibility = "**/XCUIElementTypeOther[`label == \"Главная, tab, 1 of 5 Мои авто, tab, 2 of 5 Сервисы, tab, 4 of 5 Hyundai ID, tab, 5 of 5\"`][2]/XCUIElementTypeOther")
    public MobileElement loginButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement servicesButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Hyundai ID')]")
    @iOSXCUITFindBy(accessibility = "Hyundai ID, tab, 5 of 5")
    public MobileElement hyundaiIDButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Hyundai ID, tab, 5 of 5")
    public MobileElement chatButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Hyundai ID, tab, 5 of 5")
    public MobileElement profileButton;

}
