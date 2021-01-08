package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FileDownloaderPage extends AbstractPage {
    protected static final String FILE_DOWNLOADER_URL = URL + "download";
    private final String DOWNLOAD_LINK = "//*[contains(@class,'example')]//a";
    private final String DOWNLOAD_LINK_WITH_SPECIFIC_NAME = DOWNLOAD_LINK + "[%s]";

    public FileDownloaderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(FILE_DOWNLOADER_URL);
    }

    private WebElement getDownloadLinkByIndex(int index) {
        return driver.findElement(By.xpath(String.format(DOWNLOAD_LINK_WITH_SPECIFIC_NAME, index + 1)));
    }

    public void clickDownloadLinkByIndex(int index) {
        getDownloadLinkByIndex(index).click();
    }

    public List<String> getAllAvailableFileNamesForDownload() {
        List<String> allAvailableFileNames = new ArrayList<>();
        for (WebElement element : driver.findElements(By.xpath(DOWNLOAD_LINK))) {
            allAvailableFileNames.add(element.getText());
        }
        return allAvailableFileNames;
    }
}
