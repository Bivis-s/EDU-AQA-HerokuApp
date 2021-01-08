package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContextMenuPage extends AbstractPage {
    protected static final String CONTEXT_MENU_URL = URL + "context_menu";
    private static final int TIME_OUT_IN_SECONDS = 3;
    private final By DIV_HOT_SPOT_BOX = By.xpath("//*[@id='hot-spot']");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(CONTEXT_MENU_URL);
    }

    public void clickBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(DIV_HOT_SPOT_BOX)).build().perform();
    }

    public void waitForAlertDisplayed() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.alertIsPresent());
    }

    public boolean isAlertDisplayed() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String getAlertText() {
        return (driver.switchTo().alert()).getText();
    }

    public void dismissAlert() {
        (driver.switchTo().alert()).dismiss();
    }
}
