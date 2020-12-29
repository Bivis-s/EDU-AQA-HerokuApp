package tests.file_uploader_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FileUploaderPage;
import tests.AbstractTest;

public class FileUploaderTest extends AbstractTest {
    FileUploaderPage fileUploaderPage;

    @BeforeMethod
    public void initPage() {
        fileUploaderPage = new FileUploaderPage(getDriver());
    }

    @Test
    public void uploadFileViaInputAndCheckFileNameTest() {
        fileUploaderPage.openPage();

        fileUploaderPage.uploadFileToInput(Values.file);
        fileUploaderPage.clickSubmitInputButton();

        Assert.assertTrue(fileUploaderPage.getUploadedFiles().contains(Values.fileName));
    }

}
