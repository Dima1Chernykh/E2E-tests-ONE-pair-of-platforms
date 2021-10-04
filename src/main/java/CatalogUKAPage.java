import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CatalogUKAPage {

    public CatalogUKAPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement backArrow;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Каталог UKA')]")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement ukaHeaderText;
    // filters
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:BUTTON_FILTER")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement filterButton;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:ACTIVE_FILTER_FUELTYPE_TEXT")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement fuelTypeButtonText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:ACTIVE_FILTER_TRANSMISSION_TEXT")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement akppButtonText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_CURRENT_SORTING")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement currentNumberText;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"UKA_CATALOG-SCREEN:BUTTON_CURRENT_SORTING\"]/android.widget.TextView")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement currentSortingText;
    //
    // car card
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"UKA_CATALOG-SCREEN:BUTTON_CAR_CARD\"])[1]/android.view.ViewGroup/android.widget.ImageView")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement carImg;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"UKA_CATALOG-SCREEN:TEXT_TITLE_CAR_CARD\"])[1]")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement carNameText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_MILEAGE_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement mileageText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_ENGINE_INFO_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement engineText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_TRANSMISSION_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement akppText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_DRIVE_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement driveUnitText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_LOCALE_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement localeCarText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_PRICE_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement priceCarText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_CREDIT_TEXT_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement inCreditText;
    @AndroidFindBy(accessibility = "UKA_CATALOG-SCREEN:TEXT_CREDIT_MIN_PAYMENT_CAR_CARD")
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Готовлю шедевры, а не автомобиль к продаже\"`]")
    public MobileElement minPaymentCreditText;

}
