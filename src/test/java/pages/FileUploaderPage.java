package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class FileUploaderPage extends AbstractPage {
    protected static final String FILE_UPLOADER_URL = URL + "upload";
    private final By INPUT_FILE_UPLOAD = By.id("file-upload");
    private final By BUTTON_SUBMIT_UPLOAD = By.id("file-submit");
    private final By DIV_UPLOADED_FILES = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(FILE_UPLOADER_URL);
    }

    public void uploadFileToInput(File file) {
        driver.findElement(INPUT_FILE_UPLOAD).sendKeys(file.getAbsolutePath());
    }

    public void clickSubmitInputButton() {
        driver.findElement(BUTTON_SUBMIT_UPLOAD).click();
    }

    public String getUploadedFiles() {
        return driver.findElement(DIV_UPLOADED_FILES).getText();
    }
}
