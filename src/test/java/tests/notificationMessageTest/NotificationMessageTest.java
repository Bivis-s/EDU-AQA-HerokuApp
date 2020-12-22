package tests.notificationMessageTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;
import tests.AbstractTest;

public class NotificationMessageTest extends AbstractTest {

    NotificationMessagePage notificationMessagePage;

    @BeforeMethod
    public void initPage() {
        notificationMessagePage = new NotificationMessagePage(driver);
    }

    @Test
    public void notificationAtOpenPageTest() {

        // open page
        notificationMessagePage.openPage();

        // assert if there is no Message
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());

    }

    @Test
    public void clickLinkTest() {

        // open page
        notificationMessagePage.openPage();

        // assert if there is no Message
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());

        // click link
        notificationMessagePage.clickLoadMessageLink();

        // assert if there is Message
        Assert.assertTrue(notificationMessagePage.isNotificationDisplayed());

        // get Message text
        String messageText = notificationMessagePage.getNotificationText();

        // assert Message text
        Assert.assertTrue(Values.MESSAGES_TEXTS.contains(messageText), messageText);

    }

    // works wrong if run in the headless mode
    @Test
    public void closeNotificationTest() {

        // open page
        notificationMessagePage.openPage();

        // assert if there is no Message
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());

        // click link
        notificationMessagePage.clickLoadMessageLink();

        // assert if there is Message
        Assert.assertTrue(notificationMessagePage.isNotificationDisplayed());

        // click close button
        notificationMessagePage.closeNotification();

        // assert if there is no Message
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());

    }
}
