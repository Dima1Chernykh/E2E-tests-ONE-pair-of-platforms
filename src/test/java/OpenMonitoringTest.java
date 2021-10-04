import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class OpenMonitoringTest extends Methods {

    @Test
    public void testOpenMonitoring() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        MonitoringPage monitoringPage = new MonitoringPage(this.driver);

        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        wait.until(ExpectedConditions.elementToBeClickable((myAutoPage.monitoringText)));
        myAutoPage.monitoringText.click();

        softAssert.assertTrue(monitoringPage.googleMap.isDisplayed(), "googleMap is not displayed");
        softAssert.assertTrue(monitoringPage.month.isDisplayed(), "month is not displayed");
        softAssert.assertTrue(monitoringPage.date.isDisplayed(), "date is not displayed");
        softAssert.assertTrue(monitoringPage.day.isDisplayed(), "day is not displayed");
        softAssert.assertTrue(monitoringPage.fullCalendar.isDisplayed(), "fullCalendar is not displayed");

        monitoringPage.fullCalendar.click();
        softAssert.assertTrue(monitoringPage.fullCalendarDays.isDisplayed(), "fullCalendarDays is not displayed");

        softAssert.assertAll();
    }

}
