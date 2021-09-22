import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class GoToMainPageTest extends Methods {

    @Test
    public void testAppIsOpen() {

        System.out.println(this.getClass().getName() + " " + "started!");

        StartPage1 startPage1 = new StartPage1(driver);
        MainPage mainPage = new MainPage(driver);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(startPage1.firstMessage.isDisplayed(), "firstMessage is not displayed");
        softAssert.assertTrue(startPage1.firstText.isDisplayed(), "firstText is not displayed");

        tapElementAt(startPage1.page, 0.72,0.985);
        softAssert.assertTrue(startPage1.secondMessage.isDisplayed(), "secondMessage is not displayed");
        softAssert.assertTrue(startPage1.secondText.isDisplayed(), "secondText is not displayed");

        new TouchAction(driver)
                .press(PointOption.point((int)returnX(startPage1.page, 0.85), (int)returnY(startPage1.page, 0.3)))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point((int)returnX(startPage1.page,0.15), (int)returnY(startPage1.page, 0.3)))
                .release()
                .perform();
        softAssert.assertTrue(startPage1.thirdMessage.isDisplayed(), "thirdMessage is not displayed");
        softAssert.assertTrue(startPage1.thirdText.isDisplayed(), "thirdText is not displayed");

        tapElementAt(startPage1.page, 0.72,0.985);
        softAssert.assertTrue(startPage1.fourthMessage.isDisplayed(), "fourthMessage is not displayed");
        softAssert.assertTrue(startPage1.fourthText.isDisplayed(), "fourthText is not displayed");
        softAssert.assertTrue(startPage1.fourthStartButton.isDisplayed(), "fourthStartButton is not displayed");

        startPage1.fourthStartButton.click();
        softAssert.assertTrue(mainPage.mainButton.isDisplayed(), "mainButton is not displayed");

        softAssert.assertAll();
    }

}
