package tests.typos_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TyposPage;
import tests.AbstractTest;

public class TyposTest extends AbstractTest {
    TyposPage typosPage;

    @BeforeMethod
    public void initPage() {
        typosPage = new TyposPage(getDriver());
    }

    @Test
    public void containsTypoTest() {
        typosPage.openPage();
        Assert.assertFalse(typosPage.isParagraphContainsTypo());
    }
}
