import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchAndChangeCityTest extends Methods {

    @Test
    public void testSearchAndChangeCity() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        CityPage cityPage = new CityPage(this.driver);

        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        wait.until(ExpectedConditions.elementToBeClickable((myAutoPage.fuelAutoText)));
        myAutoPage.newAutoText.click();

        myAutoPage.cityChange.click();
        softAssert.assertTrue(cityPage.cityHeader.isDisplayed(), "cityHeader is not displayed");

        cityPage.searchInput.sendKeys("Сочи");
        String searchInputText = cityPage.searchInput.getText();
        softAssert.assertEquals(searchInputText, cityPage.firstCity.getText(), "Search is incorrect");

        cityPage.firstCity.click();
        softAssert.assertEquals(searchInputText, myAutoPage.city.getText(), "New city is not chosen");

        softAssert.assertAll();
    }

}
