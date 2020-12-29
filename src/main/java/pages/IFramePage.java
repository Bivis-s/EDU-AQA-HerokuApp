package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFramePage extends AbstractPage {
    protected static String IFRAME_URL = URL + "iframe";
    private final By IFRAME = By.xpath("//iframe[contains(@class,'iframe')]");
    private final By IFRAME_EDITOR_TEXT = By.xpath("//*[@id='tinymce']/p");

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(IFRAME_URL);
    }

    public void switchToIFrame() {
        (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IFRAME));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(IFRAME));
    }

    public String getIFrameEditorText() {
        return driver.findElement(IFRAME_EDITOR_TEXT).getText();
    }

    public void clearIFrameEditor() {
        driver.findElement(IFRAME_EDITOR_TEXT).clear();
    }

    public void sendKeysToIFrameEditor(String... keys) {
        driver.findElement(IFRAME_EDITOR_TEXT).sendKeys(keys);
    }
}
