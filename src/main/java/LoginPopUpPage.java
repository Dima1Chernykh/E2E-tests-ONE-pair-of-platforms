import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopUpPage {

    public LoginPopUpPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Добро пожаловать в Номер вашего телефона +7 999 999 99 99 Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения Продолжить Horizontal scroll bar, 1 page Vertical scroll bar, 1 page\"`][11]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public MobileElement closeButton;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Добро пожаловать в')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Добро пожаловать в\"`]")
    public MobileElement welcomeToText;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Номер вашего телефона')]")
    @iOSXCUITFindBy(accessibility = "Номер вашего телефона")
    public MobileElement phoneHeaderText;
    @AndroidFindBy(className = "android.widget.EditText")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField")
    public MobileElement phoneInput;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения\"`]")
    public MobileElement acceptText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Продолжая, я даю согласие ООО «Хендэ Мотор СНГ» на обработку своих Персональных данных и принимаю условия Пользовательского соглашения\"`][2]/XCUIElementTypeOther[1]")
    public MobileElement checkbox;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Продолжить')]")
    @iOSXCUITFindBy(accessibility = "Продолжить")
    public MobileElement continueButton;
    // prod/dev modal
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(accessibility = "Вам предоставлен доступ к DEV окружению")
    public MobileElement modalHeaderText;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Введите последние четыре цифры звонившего номера")
    public MobileElement prodButton;
    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(accessibility = "Остаться на PROD")
    public MobileElement devButton;
    // enter code page
    @AndroidFindBy(xpath = "//*[contains(@text, 'Введите последние четыре цифры звонившего номера')]")
    @iOSXCUITFindBy(accessibility = "Введите последние четыре цифры звонившего номера")
    public MobileElement enterCodeText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Добро пожаловать в Номер вашего телефона Введите последние четыре цифры звонившего номера Сделать звонок повторно\"`][3]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public MobileElement devCodeInput;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Данные указаны неверно или устарели')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Данные указаны неверно или устарели'")
    public MobileElement wrongCodeText;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Ошибка валидации')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Ошибка валидации'")
    public MobileElement invalidCodeText;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Сделать звонок повторно')]")
    @iOSXCUITFindBy(accessibility = "Сделать звонок повторно")
    public MobileElement repeatCall;

}
