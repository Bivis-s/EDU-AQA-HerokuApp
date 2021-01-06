package tests.add_remove_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import tests.AbstractTest;

public class AddRemoveTest extends AbstractTest {
    private AddRemovePage addRemovePage;

    @BeforeMethod
    public void initPage() {
        addRemovePage = new AddRemovePage(getDriver());
    }

    @Test
    public void add2ElementsTest() {
        addRemovePage.openPage();
        // check if 2 element added (there are 2 new deletable buttons)
        addRemovePage.addElement(2);
        Assert.assertEquals(addRemovePage.getCountOfDeletableElements(), 2);
    }

    @Test
    public void add2Delete1ElementTest() {
        addRemovePage.openPage();
        addRemovePage.addElement(2);
        addRemovePage.removeElement(1);
        // check if there is now only an element
        Assert.assertEquals(addRemovePage.getCountOfDeletableElements(), 1);
    }
}
