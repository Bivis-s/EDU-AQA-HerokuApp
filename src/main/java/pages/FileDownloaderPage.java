package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownloaderPage extends AbstractPage {
    protected static final String FILE_DOWNLOADER_URL = URL + "download";
    private final String DOWNLOAD_LINK = "//*[contains(@class,'example')]//a";
    private final String DOWNLOAD_LINK_WITH_SPECIFIC_NAME = DOWNLOAD_LINK + "[text()='%s']";

    public FileDownloaderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(FILE_DOWNLOADER_URL);
    }

    private WebElement getDownloadLinkByName(String name) {
        return driver.findElement(By.xpath(String.format(DOWNLOAD_LINK_WITH_SPECIFIC_NAME, name)));
    }

    public boolean isDownloadLinkVisible(String fileName) {
        return driver.findElements(By.xpath(String.format(DOWNLOAD_LINK_WITH_SPECIFIC_NAME, fileName)))
                .size() != 0;
    }

    public void clickDownloadLinkByName(String name) throws InterruptedException {
        getDownloadLinkByName(name).click();
    }
}
