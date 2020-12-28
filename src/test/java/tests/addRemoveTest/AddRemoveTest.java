package tests.addRemoveTest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddRemovePage;
import tests.AbstractTest;

public class AddRemoveTest extends AbstractTest {

    private AddRemovePage addRemovePage;

    @BeforeMethod
    public void initPage() {
        addRemovePage = new AddRemovePage(driver);
    }

    @Test
    public void add2ElementsTest() {

        addRemovePage.openPage();

        // add 2 elements
        addRemovePage.addElement(2);

        // check if 2 element added (there are 2 new deletable buttons)
        Assert.assertEquals(
                addRemovePage.getCountOfDeletableElements(), 2);
    }

    @Test
    public void add2Delete1ElementTest() {

        addRemovePage.openPage();

        // add 2 elements
        addRemovePage.addElement(2);

        // check if 2 element added (there are 2 new deletable buttons)
        Assert.assertEquals(
                addRemovePage.getCountOfDeletableElements(), 2);

        // remove 1 element
        addRemovePage.removeElement(1);

        // check if there is now only an element
        Assert.assertEquals(
                addRemovePage.getCountOfDeletableElements(), 1);
    }
}
