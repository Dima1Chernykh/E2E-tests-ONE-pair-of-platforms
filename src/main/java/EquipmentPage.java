import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class EquipmentPage {

    public EquipmentPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement backArrowButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement header;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement equipmentTitle;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement carCharacteristic;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement carImg;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement gallery;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сервисы')]")
    @iOSXCUITFindBy(accessibility = "Сервисы, tab, 4 of 5")
    public MobileElement price;

}
