import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class CarDetailPage {

    public CarDetailPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailBackArrow;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailHeaderText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailImg;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailName;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailPrice;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailCredit;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailAdress;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailStatistic;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailSpecText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailAKPP;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailEngine;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailMileage;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailFuel;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailColor;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Детали автомобиля')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement carDetailAllSpec;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Купить')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement buyButton;

}
