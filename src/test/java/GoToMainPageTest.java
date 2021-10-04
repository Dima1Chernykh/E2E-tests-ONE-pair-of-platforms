import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class GoToMainPageTest extends Methods {

    @Test
    public void testGoToMainPage() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);

        StartPage startPage = new StartPage(driver);
        CityPage cityPage = new CityPage(driver);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(startPage.firstTextFirst.isDisplayed(), "firstTextFirst is not displayed");
        softAssert.assertTrue(startPage.secondTextFirst.isDisplayed(), "secondTextFirst is not displayed");
        softAssert.assertTrue(startPage.thirdTextFirst.isDisplayed(), "thirdTextFirst is not displayed");

        startPage.nextButton.click();
        Thread.sleep(1000);
        softAssert.assertTrue(startPage.firstTextSecond.isDisplayed(), "firstTextFirst is not displayed");
        softAssert.assertTrue(startPage.secondTextSecond.isDisplayed(), "secondTextFirst is not displayed");
        softAssert.assertTrue(startPage.thirdTextSecond.isDisplayed(), "thirdTextFirst is not displayed");

        startPage.nextButton.click();
        Thread.sleep(1000);
        softAssert.assertTrue(startPage.firstTextThird.isDisplayed(), "firstTextFirst is not displayed");
        softAssert.assertTrue(startPage.secondTextThird.isDisplayed(), "secondTextFirst is not displayed");
        softAssert.assertTrue(startPage.thirdTextThird.isDisplayed(), "thirdTextFirst is not displayed");

        startPage.nextButton.click();
        Thread.sleep(1000);
        softAssert.assertTrue(startPage.firstTextFourth.isDisplayed(), "firstTextFirst is not displayed");
        softAssert.assertTrue(startPage.secondTextFourth.isDisplayed(), "secondTextFirst is not displayed");
        softAssert.assertTrue(startPage.thirdTextFourth.isDisplayed(), "thirdTextFirst is not displayed");

        wait.until(ExpectedConditions.elementToBeClickable((startPage.startButtonFourth)));
        startPage.startButtonFourth.click();

        softAssert.assertTrue(cityPage.cityHeader.isDisplayed(), "cityHeader is not displayed");

        softAssert.assertAll();
    }

}
