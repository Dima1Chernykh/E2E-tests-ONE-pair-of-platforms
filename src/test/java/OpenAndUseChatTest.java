import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenAndUseChatTest extends Methods {

    @Test
    public void testOpenAndUseChat() throws InterruptedException {

        System.out.println(this.getClass().getName() + " " + "started!");

        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        MyAutoPage myAutoPage = new MyAutoPage(this.driver);
        MainPage mainPage = new MainPage(this.driver);
        ChatsPage chatsPage = new ChatsPage(this.driver);

        SoftAssert softAssert = new SoftAssert();

        loginToDev();

        wait.until(ExpectedConditions.elementToBeClickable((myAutoPage.fuelAutoText)));
        mainPage.chatButton.click();

        softAssert.assertTrue(chatsPage.chatsBackArrow.isDisplayed(), "chatsBackArrow is not displayed");
        softAssert.assertTrue(chatsPage.chatsHeader.isDisplayed(), "chatsHeader is not displayed");
        softAssert.assertTrue(chatsPage.chatsImgHeader.isDisplayed(), "chatsImgHeader is not displayed");
        softAssert.assertTrue(chatsPage.chatsNameHeader.isDisplayed(), "chatsNameHeader is not displayed");
        softAssert.assertTrue(chatsPage.chatsImgList.isDisplayed(), "chatsImgList is not displayed");
        softAssert.assertTrue(chatsPage.chatsNameList.isDisplayed(), "chatsNameList is not displayed");

        String nameInListText = chatsPage.chatsNameList.getText();
        chatsPage.chatsNameList.click();
        softAssert.assertEquals(nameInListText, chatsPage.currentChatNameHeader.getText(), "clicked and opened chat do not match");
        softAssert.assertTrue(chatsPage.currentChatBackArrow.isDisplayed(), "currentChatBackArrow is not displayed");


        String readyMessageClickedText = chatsPage.readyMessageText.getText();
        chatsPage.readyMessageText.click();
        softAssert.assertEquals(chatsPage.firstMessage.getText(), readyMessageClickedText, "ready message button is not work");

        chatsPage.chatInput.sendKeys(generateRandomHexString(10));
        String enteredText = chatsPage.chatInput.getText();
        chatsPage.sendMessageButton.click();
        softAssert.assertEquals(chatsPage.firstMessage.getText(), enteredText, "ready message button is not work");

        chatsPage.addFilesButton.click();
        softAssert.assertTrue(chatsPage.makePhoto.isDisplayed(), "makePhoto is not displayed");
        softAssert.assertTrue(chatsPage.uploadPhoto.isDisplayed(), "uploadPhoto is not displayed");
        softAssert.assertTrue(chatsPage.uploadDocument.isDisplayed(), "uploadDocument is not displayed");

        softAssert.assertAll();
    }

}
