import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenTarifPageTest extends Methods {

    @Test
    public void testOpenTarifPage() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        TarifPage tarifPage = new TarifPage(this.driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        wait.until(ExpectedConditions.elementToBeClickable((myAutoPage.fuelAutoText)));
        myAutoPage.newAutoText.click();
        myAutoPage.carImg.click();

        softAssert.assertTrue(tarifPage.backArrow.isDisplayed(), "backArrow is not displayed");
        softAssert.assertTrue(tarifPage.tarifHeaderText.isDisplayed(), "tarifHeaderText is not displayed");
        softAssert.assertTrue(tarifPage.carNameText.isDisplayed(), "carNameText is not displayed");
        softAssert.assertTrue(tarifPage.aboutModelText.isDisplayed(), "aboutModelText is not displayed");
        softAssert.assertTrue(tarifPage.carImg.isDisplayed(), "carImg is not displayed");
        softAssert.assertTrue(tarifPage.month12text.isDisplayed(), "month12text is not displayed");
        softAssert.assertTrue(tarifPage.fullTarif.isDisplayed(), "fullTarif is not displayed");
        softAssert.assertTrue(tarifPage.monthLimitText.isDisplayed(), "monthLimitText is not displayed");
        softAssert.assertTrue(tarifPage.monthLimitValueText.isDisplayed(), "monthLimitValueText is not displayed");
        softAssert.assertTrue(tarifPage.overLimitText.isDisplayed(), "overLimitText is not displayed");
        softAssert.assertTrue(tarifPage.overLimitValueText.isDisplayed(), "overLimitValueText is not displayed");
        softAssert.assertTrue(tarifPage.priceText.isDisplayed(), "priceText is not displayed");
        softAssert.assertTrue(tarifPage.lightTarif.isDisplayed(), "lightTarif is not displayed");

        tarifPage.aboutModelText.click();

        softAssert.assertAll();
    }

}
