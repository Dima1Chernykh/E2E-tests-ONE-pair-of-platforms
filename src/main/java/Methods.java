import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Random;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.lang.Thread.sleep;
import static java.time.Duration.ofMillis;


public class Methods extends BaseMethods {

    protected AppiumDriver<?> driver;

    @BeforeMethod
    public void setUp() throws Exception {
//        driver = BaseMethods.returnDriver(System.getenv("TESTING_PLATFORM"));
        driver = BaseMethods.returnDriver(BaseMethods.readProperty("run.platform"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    // random string generation
    public static String generateRandomHexString (int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    // tap to coordinates
    ExpectedCondition<Boolean> elementFoundAndClicked(final By locator) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                WebElement el = driver.findElement(locator);
                el.click();
                return true;
            }
        };
    }

    protected AppiumDriver<?> getDriver() {
        return this.driver;
    }

    public void tapAtPoint(Point point) {
        AppiumDriver<MobileElement> d = (AppiumDriver<MobileElement>) this.getDriver();
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence tap = new Sequence(input, 0);
        tap.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), point.x, point.y));
        tap.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(new Pause(input, ofMillis(200L)));
        tap.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        d.perform(ImmutableList.of(tap));
    }
    // tap to coordinates
    public WebElement tapElementAt(WebElement el, double xPct, double yPct) {
        Rectangle elRect = el.getRect();
        Point point = new Point(elRect.x + (int)((double)elRect.getWidth() * xPct), elRect.y + (int)((double)elRect.getHeight() * yPct));
        this.tapAtPoint(point);
        return el;
    }
    // return X coord
    public double returnX(WebElement el, double xPct) {
        Rectangle elRect = el.getRect();
        double point = elRect.x + (int)((double)elRect.getWidth() * xPct);
        return point;
    }
    // return Y coord
    public double returnY(WebElement el, double yPct) {
        Rectangle elRect = el.getRect();
        double point = elRect.y + (int)((double)elRect.getHeight() * yPct);
        return point;
    }

    public void tapElement(WebElement el) {
        this.tapElementAt(el, 0.5D, 0.5D);
    }
    //

    // long tap with custom duration
    public static Boolean moveToThenSlowClickElement(final WebDriver driver, final WebElement toElement, final int millisecondsOfWaitTime) throws InterruptedException {
        final Actions clickOnElementAndHold = new Actions(driver);
        final Actions release = new Actions(driver);
        clickOnElementAndHold.clickAndHold(toElement).perform();

        sleep(millisecondsOfWaitTime);

        final Action hoverOverCheckBox = clickOnElementAndHold.build();
        hoverOverCheckBox.perform();

        return true;
    }

    protected void skipStartCarousel() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        StartPage startPage = new StartPage(this.driver);
        CityPage cityPage = new CityPage(this.driver);
        MainPage mainPage = new MainPage(this.driver);
        SoftAssert softAssert = new SoftAssert();

        wait.until(ExpectedConditions.elementToBeClickable((startPage.nextButton)));

        startPage.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable((startPage.firstTextSecond)));

        startPage.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable((startPage.firstTextThird)));

        startPage.nextButton.click();
        wait.until(ExpectedConditions.elementToBeClickable((startPage.firstTextFourth)));

        wait.until(ExpectedConditions.elementToBeClickable((startPage.startButtonFourth)));
        startPage.startButtonFourth.click();

        softAssert.assertTrue(cityPage.cityHeader.isDisplayed(), "cityHeader is not displayed");
        cityPage.firstCity.click();
        softAssert.assertTrue(mainPage.mainButton.isDisplayed(), "mainButton is not displayed");
        softAssert.assertAll();
    }

    protected void loginToDev() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        StartPage startPage = new StartPage(this.driver);
        MainPage mainPage = new MainPage(this.driver);
        LoginPopUpPage loginPopUpPage = new LoginPopUpPage(this.driver);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        SoftAssert softAssert = new SoftAssert();

        wait.until(ExpectedConditions.elementToBeClickable((startPage.nextButton)));

        skipStartCarousel();

        mainPage.hyundaiIDButton.click();
        loginPopUpPage.phoneInput.sendKeys(phone);
        loginPopUpPage.checkbox.click();
        loginPopUpPage.continueButton.click();
        loginPopUpPage.devButton.click();
        Thread.sleep(1000);
        loginPopUpPage.devButton.click();
        loginPopUpPage.devCodeInput.sendKeys(confirmCodeDEV);
        softAssert.assertTrue(myAutoPage.myAutoText.isDisplayed(), "myAutoText is not displayed");
        softAssert.assertAll();
    }

}
