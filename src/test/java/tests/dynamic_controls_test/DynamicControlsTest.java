package tests.dynamic_controls_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;
import tests.AbstractTest;

public class DynamicControlsTest extends AbstractTest {
    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void initPage() {
        dynamicControlsPage = new DynamicControlsPage(getDriver());
    }

    @Test
    public void checkboxVisibleTest() {
        dynamicControlsPage.openPage();
        Assert.assertTrue(dynamicControlsPage.isCheckboxVisible());
    }

    @Test
    public void removeCheckboxTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        Assert.assertTrue(dynamicControlsPage.isCheckboxInvisible());
    }

    @Test
    public void removeCheckboxMessageGoneTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        Assert.assertEquals(dynamicControlsPage.getCheckboxConditionMessage(), Values.CHECKBOX_CONDITION_MESSAGE_GONE);
    }

    @Test
    public void removeThenAddCheckboxTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        dynamicControlsPage.isCheckboxInvisible();
        dynamicControlsPage.clickAddCheckboxButton();
        Assert.assertTrue(dynamicControlsPage.isCheckboxVisible());
    }

    @Test
    public void removeCheckboxMessageBackTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickRemoveCheckboxButton();
        dynamicControlsPage.isCheckboxInvisible();
        dynamicControlsPage.clickAddCheckboxButton();
        Assert.assertEquals(dynamicControlsPage.getCheckboxConditionMessage(), Values.CHECKBOX_CONDITION_MESSAGE_BACK);
    }

    @Test
    public void inputDisabledTest() {
        dynamicControlsPage.openPage();
        Assert.assertTrue(dynamicControlsPage.isInputFieldDisabled());
    }

    @Test
    public void enableInputTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickEnableInputButton();
        Assert.assertTrue(dynamicControlsPage.isInputFieldEnabled());
    }

    @Test
    public void checkEnabledInputMessageTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickEnableInputButton();
        Assert.assertEquals(dynamicControlsPage.getCheckboxConditionMessage(), Values.INPUT_CONDITION_MESSAGE_ENABLED);
    }

    @Test
    public void checkDisabledInputMessageTest() {
        dynamicControlsPage.openPage();
        dynamicControlsPage.clickEnableInputButton();
        dynamicControlsPage.getCheckboxConditionMessage();
        dynamicControlsPage.clickDisableInputButton();
        Assert.assertEquals(dynamicControlsPage.getCheckboxConditionMessage(), Values.INPUT_CONDITION_MESSAGE_DISABLED);
    }
}
