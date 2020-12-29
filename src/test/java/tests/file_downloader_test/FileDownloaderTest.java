package tests.file_downloader_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FileDownloaderPage;
import tests.AbstractTest;
import tools.TestTools;

import java.io.IOException;

public class FileDownloaderTest extends AbstractTest {
    FileDownloaderPage fileUploaderPage;

    @BeforeMethod
    public void initPage() {
        fileUploaderPage = new FileDownloaderPage(getDriver());
    }

    @Test
    public void isFileDownloadLinkVisible() {
        fileUploaderPage.openPage();
        Assert.assertTrue(fileUploaderPage.isDownloadLinkVisible(Values.FILE_NAME));
    }

    @Test
    public void downloadFileAndCheckContentTest() throws IOException, InterruptedException {
        fileUploaderPage.openPage();

        fileUploaderPage.clickDownloadLinkByName(Values.FILE_NAME);
        Assert.assertEquals(TestTools.readTextFile(Values.FILE_PATH, 5000), Values.FILE_CONTENT);
        // delete downloaded file
        Assert.assertTrue(TestTools.deleteFile(Values.FILE_PATH));
    }
}
