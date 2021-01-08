package tests.dropdown_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import tests.AbstractTest;

public class DropdownTest extends AbstractTest {
    private DropdownPage dropdownPage;

    private void selectOptionAndAssertSelection(int indexOfOption) {
        dropdownPage.selectOption(indexOfOption);
        Assert.assertTrue(dropdownPage.isOptionSelected(indexOfOption));
    }

    @BeforeMethod
    public void initPage() {
        dropdownPage = new DropdownPage(getDriver());
    }

    @Test
    public void allEnabledOptionsValuesInDropdownTest() {
        dropdownPage.openPage();
        List<Integer> actualValues = dropdownPage
                .getDropdownIntegerValues(dropdownPage.getEnabledOptionsInDropdown());
        Assert.assertEquals(actualValues, Values.EXPECTED_DROPDOWN_ENABLED_VALUES);
    }

    @Test
    public void select1stOptionTest() {
        dropdownPage.openPage();
        selectOptionAndAssertSelection(0);
    }

    @Test
    public void select2ndOptionTest() {
        dropdownPage.openPage();
        selectOptionAndAssertSelection(1);
    }
}
