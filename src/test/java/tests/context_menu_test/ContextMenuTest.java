package tests.context_menu_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import tests.AbstractTest;

public class ContextMenuTest extends AbstractTest {
    private ContextMenuPage contextMenuPage;

    @BeforeMethod
    public void initPage() {
        contextMenuPage = new ContextMenuPage(getDriver());
    }

    @Test
    public void clickBoxTest() {
        contextMenuPage.openPage();

        contextMenuPage.clickBox();
        Assert.assertTrue(contextMenuPage.isAlertDisplayed());
    }

    @Test
    public void validateAlertTextTest() {
        contextMenuPage.openPage();

        contextMenuPage.clickBox();
        Assert.assertEquals(contextMenuPage.getAlertText(), Values.EXPECTED_ALERT_TEXT);
    }

    @Test
    public void dismissAlertTest() {
        contextMenuPage.openPage();

        contextMenuPage.clickBox();
        Assert.assertTrue(contextMenuPage.isAlertDisplayed());

        contextMenuPage.dismissAlert();
        Assert.assertFalse(contextMenuPage.isAlertDisplayed());
    }
}
