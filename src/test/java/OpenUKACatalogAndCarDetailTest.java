import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenUKACatalogAndCarDetailTest extends Methods {

    @Test
    public void testOpenUKACatalogAndCarDetail() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        CatalogUKAPage ukaPage = new CatalogUKAPage(this.driver);
        CarDetailPage carDetailPage = new CarDetailPage(this.driver);
        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        wait.until(ExpectedConditions.elementToBeClickable((myAutoPage.fuelAutoText)));
        myAutoPage.newAutoText.click();
        myAutoPage.withMileage.click();

        softAssert.assertTrue(ukaPage.ukaHeaderText.isDisplayed(), "ukaHeaderText is not displayed");
        softAssert.assertTrue(ukaPage.filterButton.isDisplayed(), "filterButton is not displayed");
        softAssert.assertTrue(ukaPage.fuelTypeButtonText.isDisplayed(), "fuelTypeButtonText is not displayed");
        softAssert.assertTrue(ukaPage.akppButtonText.isDisplayed(), "akppButtonText is not displayed");
        softAssert.assertTrue(ukaPage.currentNumberText.isDisplayed(), "currentNumberText is not displayed");
        softAssert.assertTrue(ukaPage.currentSortingText.isDisplayed(), "currentSortingText is not displayed");
        softAssert.assertTrue(ukaPage.carImg.isDisplayed(), "carImg is not displayed");
        softAssert.assertTrue(ukaPage.carNameText.isDisplayed(), "carNameText is not displayed");
        String carName = ukaPage.carNameText.getText().substring(0, ukaPage.carNameText.getText().length() - 5);
        softAssert.assertTrue(ukaPage.mileageText.isDisplayed(), "mileageText is not displayed");
        String mileage = ukaPage.mileageText.getText();
        softAssert.assertTrue(ukaPage.engineText.isDisplayed(), "engineText is not displayed");
        softAssert.assertTrue(ukaPage.akppText.isDisplayed(), "akppText is not displayed");
        softAssert.assertTrue(ukaPage.driveUnitText.isDisplayed(), "driveUnitText is not displayed");
        softAssert.assertTrue(ukaPage.localeCarText.isDisplayed(), "localeCarText is not displayed");
        softAssert.assertTrue(ukaPage.priceCarText.isDisplayed(), "priceCarText is not displayed");
        String priceCar = ukaPage.priceCarText.getText();
        softAssert.assertTrue(ukaPage.inCreditText.isDisplayed(), "inCreditText is not displayed");
        softAssert.assertTrue(ukaPage.minPaymentCreditText.isDisplayed(), "minPaymentCreditText is not displayed");
        String minPaymentCredit = ukaPage.minPaymentCreditText.getText();

        ukaPage.carImg.click();

        softAssert.assertTrue(carDetailPage.carDetailHeaderText.isDisplayed(), "carDetailHeaderText is not displayed");
        softAssert.assertTrue(carDetailPage.buyButton.isDisplayed(), "buyButton is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailImg.isDisplayed(), "carDetailImg is not displayed");

        String carDetailName = carDetailPage.carDetailName.getText().substring(0, carDetailPage.carDetailName.getText().length() - 4);
        softAssert.assertEquals(carDetailName, carName, "carDetailName is not displayed");

        softAssert.assertEquals(carDetailPage.carDetailPrice.getText(), priceCar, "carDetailPrice is not displayed");
        softAssert.assertEquals(carDetailPage.carDetailCredit.getText(), (minPaymentCredit + " в кредит") , "carDetailCredit is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailAdress.isDisplayed(), "carDetailAdress is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailStatistic.isDisplayed(), "carDetailStatistic is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailSpecText.isDisplayed(), "carDetailSpecText is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailAKPP.isDisplayed(), "carDetailAKPP is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailEngine.isDisplayed(), "carDetailEngine is not displayed");
        softAssert.assertEquals(carDetailPage.carDetailMileage.getText(), mileage, "carDetailMileage is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailFuel.isDisplayed(), "carDetailFuel is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailColor.isDisplayed(), "carDetailColor is not displayed");
        softAssert.assertTrue(carDetailPage.carDetailAllSpec.isDisplayed(), "carDetailAllSpec is not displayed");

        softAssert.assertAll();
    }

}
