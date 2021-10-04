import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class CityPage {

    public CityPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(accessibility = "Главная, tab, 1 of 5")
    public MobileElement citiesPopUp;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Город')]")
    @iOSXCUITFindBy(accessibility = "Главная, tab, 1 of 5")
    public MobileElement cityHeader;

    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(accessibility = "Мои авто, tab, 2 of 5")
    public MobileElement searchInput;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Главная')]")
    @iOSXCUITFindBy(accessibility = "**/XCUIElementTypeOther[`label == \"Главная, tab, 1 of 5 Мои авто, tab, 2 of 5 Сервисы, tab, 4 of 5 Hyundai ID, tab, 5 of 5\"`][2]/XCUIElementTypeOther")
    public MobileElement firstCity;
}
