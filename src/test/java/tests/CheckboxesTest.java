package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTest extends AbstractTest {

    private CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void openPage() {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openPage();
    }

    @Test
    public void is1stCheckboxUncheckedTest() {

        Assert.assertFalse(checkboxesPage
                .isCheckboxChecked(1));
    }

    @Test
    public void is2ndCheckboxCheckedTest() {

        Assert.assertTrue(checkboxesPage
                .isCheckboxChecked(2));
    }

    @Test
    public void check1stCheckboxTest() {

        is1stCheckboxUncheckedTest();

        checkboxesPage.clickCheckbox(1);

        Assert.assertTrue(checkboxesPage
                .isCheckboxChecked(1));
    }

    @Test
    public void uncheck2ndCheckboxTest() {

        is2ndCheckboxCheckedTest();

        checkboxesPage.clickCheckbox(2);

        Assert.assertFalse(checkboxesPage
                .isCheckboxChecked(2));
    }

    @Test
    public void check1stCheckboxAndUncheck2ndCheckboxTest() {
        check1stCheckboxTest();
        uncheck2ndCheckboxTest();
    }
}
