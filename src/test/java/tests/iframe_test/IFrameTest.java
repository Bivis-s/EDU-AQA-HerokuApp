package tests.iframe_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.IFramePage;
import tests.AbstractTest;

public class IFrameTest extends AbstractTest {
    IFramePage iFramePage;

    @BeforeMethod
    public void initPage() {
        iFramePage = new IFramePage(getDriver());
    }

    @Test
    public void checkDefaultIFrameText() {
        iFramePage.openPage();
        iFramePage.switchToIFrame();
        Assert.assertEquals(iFramePage.getIFrameEditorText(), Values.EXPECTED_DEFAULT_IFRAME_TEXT);
    }

    @Test
    public void writeTextToIFrameTest() {
        iFramePage.openPage();
        iFramePage.switchToIFrame();
        iFramePage.clearIFrameEditor();
        iFramePage.sendKeysToIFrameEditor(Values.TEXT_TO_WRITE);
        Assert.assertEquals(iFramePage.getIFrameEditorText(), Values.EXPECTED_WROTE_TEXT);
    }
}
