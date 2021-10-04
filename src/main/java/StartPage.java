import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage {

    public StartPage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]")
    public MobileElement page;

    @AndroidFindBy(id = "START_CAROUSEL:NEXT_BUTTON")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:NEXT_BUTTON")
    public MobileElement nextButton;

    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_1_SLIDE_0")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_1_SLIDE_0")
    public MobileElement firstTextFirst;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_2_SLIDE_0")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_2_SLIDE_0")
    public MobileElement secondTextFirst;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_3_SLIDE_0")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_3_SLIDE_0")
    public MobileElement thirdTextFirst;

    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_1_SLIDE_1")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_1_SLIDE_1")
    public MobileElement firstTextSecond;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_2_SLIDE_1")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_2_SLIDE_1")
    public MobileElement secondTextSecond;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_3_SLIDE_1")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_3_SLIDE_1")
    public MobileElement thirdTextSecond;

    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_1_SLIDE_2")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_1_SLIDE_2")
    public MobileElement firstTextThird;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_2_SLIDE_2")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_2_SLIDE_2")
    public MobileElement secondTextThird;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_3_SLIDE_2")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_3_SLIDE_2")
    public MobileElement thirdTextThird;

    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_1_SLIDE_3")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_1_SLIDE_3")
    public MobileElement firstTextFourth;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_2_SLIDE_3")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_2_SLIDE_3")
    public MobileElement secondTextFourth;
    @AndroidFindBy(id = "START_CAROUSEL:START_TEXT_3_SLIDE_3")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_TEXT_3_SLIDE_3")
    public MobileElement thirdTextFourth;

    @AndroidFindBy(id = "START_CAROUSEL:START_BUTTON")
    @iOSXCUITFindBy(accessibility = "START_CAROUSEL:START_BUTTON")
    public MobileElement startButtonFourth;

}