package tests.file_downloader_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FileDownloaderPage;
import tests.AbstractTest;
import tools.TestTools;

public class FileDownloaderTest extends AbstractTest {
    FileDownloaderPage fileUploaderPage;

    @BeforeMethod
    public void initPage() {
        fileUploaderPage = new FileDownloaderPage(getDriver());
    }

    @Test
    public void downloadFileTest() throws InterruptedException {
        fileUploaderPage.openPage();
        String fileName = fileUploaderPage.getAllAvailableFileNamesForDownload().get(Values.FIRST_INDEX);
        String filePath = Values.DOWNLOAD_PATH + fileName;
        fileUploaderPage.clickDownloadLinkByIndex(Values.FIRST_INDEX);
        Assert.assertTrue(TestTools.waitForFile(filePath, 10000));
        // delete downloaded file
        Assert.assertTrue(TestTools.deleteFile(filePath));
    }
}
