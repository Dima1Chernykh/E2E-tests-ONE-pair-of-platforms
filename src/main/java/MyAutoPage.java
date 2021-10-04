import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAutoPage {

    public MyAutoPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//*[contains(@text, 'Мои авто')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement myAutoText;
    @AndroidFindBy(xpath = "//*[contains(@text, 'Новые авто')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Новые авто\"`][3]")
    public MobileElement newAutoText;

    // my auto locators
    @AndroidFindBy(xpath = "//*[contains(@text, 'Важное')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement importantText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Заправка авто')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement fuelAutoText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Техническое обслуживание\n')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement TOText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Поездка')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement driveText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Мониторинг')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement monitoringText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Продать авто')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement sellAutoText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Популярные сервисы')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement popularServicesText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Автомойка с доставкой')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement carWashText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Статистика')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement statisticText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Управление финансами')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement financeManageText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Штрафы ГИБДД')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement gibddText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Платеж за подписку\n')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement paySubscribeText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'При ДТП')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement ifDTPText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Оформить случай')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement Text;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Запись на ремонт')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement arrangeCaseText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Покупки в автомобиль')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement buyInAutoText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Ozon')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement ozonText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Сбермаркет')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement sbermarketText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Выйти')]")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Мои авто (2)\"`][3]")
    public MobileElement logoutText;

    // new auto
    @AndroidFindBy(xpath = "//*[contains(@text, '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Подписка'")
    public MobileElement carImg;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Подписка')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Подписка'")
    public MobileElement subscription;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Showroom')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'Showroom'")
    public MobileElement showroom;

    @AndroidFindBy(xpath = "//*[contains(@text, 'С пробегом')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'С пробегом'")
    public MobileElement withMileage;

    @AndroidFindBy(xpath = "//*[contains(@text, '/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'С пробегом'")
    public MobileElement cityText;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Изменить')]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'С пробегом'")
    public MobileElement cityChange;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "label contains 'С пробегом'")
    public MobileElement city;


}
