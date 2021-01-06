package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IFramePage extends AbstractPage {
    protected static final String IFRAME_URL = URL + "iframe";
    private static final int TIME_OUT_IN_SECONDS = 5;
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
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IFRAME));
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
