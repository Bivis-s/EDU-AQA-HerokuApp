package tests.notification_message_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;
import tests.AbstractTest;

public class NotificationMessageTest extends AbstractTest {
    NotificationMessagePage notificationMessagePage;

    @BeforeMethod
    public void initPage() {
        notificationMessagePage = new NotificationMessagePage(getDriver());
    }

    @Test
    public void notificationAtOpenPageTest() {
        notificationMessagePage.openPage();
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());
    }

    @Test
    public void clickLinkTest() {
        notificationMessagePage.openPage();
        // click link
        notificationMessagePage.clickLoadMessageLink();
        Assert.assertTrue(notificationMessagePage.isNotificationDisplayed());
        // get Message text
        String messageText = notificationMessagePage.getNotificationText();
        Assert.assertTrue(Values.MESSAGES_TEXTS.contains(messageText), messageText);
    }

    // works wrong if run in the headless mode
    @Test
    public void closeNotificationTest() {
        notificationMessagePage.openPage();
        // click link
        notificationMessagePage.clickLoadMessageLink();
        // click close button
        notificationMessagePage.closeNotification();
        Assert.assertFalse(notificationMessagePage.isNotificationDisplayed());
    }
}
