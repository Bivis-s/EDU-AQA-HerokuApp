package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveTest extends AbstractTest {

    @BeforeMethod
    public void openPage() {
        addRemovePage.openPage(AddRemovePage.URL);
    }

    @Test
    public void add2ElementsTest() {
        // add 2 elements
        addRemovePage.clickElement(AddRemovePage.BUTTON_ADD_ELEMENT, 2);
        // check if 2 element added (there are 2 new deletable buttons)
        Assert.assertEquals(addRemovePage.findElementCount(AddRemovePage.BUTTON_DELETE_ELEMENT), 2);
    }

    @Test
    public void add2Delete1ElementTest() {
        // add 2 elements
        addRemovePage.clickElement(AddRemovePage.BUTTON_ADD_ELEMENT, 2);
        // check if 2 element added (there are 2 new deletable buttons)
        Assert.assertEquals(addRemovePage.findElementCount(AddRemovePage.BUTTON_DELETE_ELEMENT), 2);

        // remove 1 element
        addRemovePage.clickElement(AddRemovePage.BUTTON_DELETE_ELEMENT, 1);
        // check if there is now only an element
        Assert.assertEquals(addRemovePage.findElementCount(AddRemovePage.BUTTON_DELETE_ELEMENT), 1);
    }
}
