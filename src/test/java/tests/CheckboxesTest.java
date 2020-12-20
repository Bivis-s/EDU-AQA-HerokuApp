package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends AbstractTest {

    private CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void initPage() {
        checkboxesPage = new CheckboxesPage(driver);
    }

    @Test
    public void is1stCheckboxUncheckedTest() {

        checkboxesPage.openPage();

        Assert.assertFalse(checkboxesPage
                .isCheckboxChecked(1));
    }

    @Test
    public void is2ndCheckboxCheckedTest() {

        checkboxesPage.openPage();

        Assert.assertTrue(checkboxesPage
                .isCheckboxChecked(2));
    }

    @Test
    public void check1stCheckboxTest() {

        checkboxesPage.openPage();

        is1stCheckboxUncheckedTest();

        checkboxesPage.clickCheckbox(1);

        Assert.assertTrue(checkboxesPage
                .isCheckboxChecked(1));
    }

    @Test
    public void uncheck2ndCheckboxTest() {

        checkboxesPage.openPage();

        is2ndCheckboxCheckedTest();

        checkboxesPage.clickCheckbox(2);

        Assert.assertFalse(checkboxesPage
                .isCheckboxChecked(2));
    }

}
