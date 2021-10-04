import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class LoginToDevTest extends Methods {

    @Test
    public void testLoginToDev() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        MainPage mainPage = new MainPage(this.driver);
        LoginPopUpPage loginPopUpPage = new LoginPopUpPage(this.driver);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        SoftAssert softAssert = new SoftAssert();

        skipStartCarousel();

        mainPage.hyundaiIDButton.click();
        softAssert.assertTrue(loginPopUpPage.welcomeToText.isDisplayed(), "'Welcome in' text is not displayed");

        loginPopUpPage.phoneInput.sendKeys(phone);
        String phoneText = loginPopUpPage.phoneInput.getText();
        loginPopUpPage.checkbox.click();
        loginPopUpPage.continueButton.click();

        softAssert.assertTrue(loginPopUpPage.modalHeaderText.isDisplayed(), "Modal or modalHeaderText is not displayed");
        loginPopUpPage.devButton.click();
        Thread.sleep(1000);
        loginPopUpPage.devButton.click();
        softAssert.assertEquals(phoneText.replaceAll("\\s+",""), ("+7" + phone),  "Modal or modalHeaderText is not displayed");

        loginPopUpPage.devCodeInput.sendKeys(confirmCodeDEV);
        softAssert.assertTrue(myAutoPage.myAutoText.isDisplayed(), "myAutoText is not displayed");

        softAssert.assertAll();
    }

}
