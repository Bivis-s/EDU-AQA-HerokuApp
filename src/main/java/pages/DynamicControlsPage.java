package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends AbstractPage {
    protected static final String DYNAMIC_CONTROL_URL = URL + "dynamic_controls";
    private static final int TIME_OUT_IN_SECONDS = 6;
    private final By CHECKBOX =
            By.xpath("//*[contains(@id,'checkbox-example')]//input[contains(@type,'checkbox')]");
    private final String BUTTON_CHECKBOX_CONDITION_XPATH =
            "//*[contains(@id,'checkbox-example')]//button[contains(text(),'%s')]";
    private final By BUTTON_ADD_CHECKBOX = By.xpath(String.format(BUTTON_CHECKBOX_CONDITION_XPATH, "Add"));
    private final By BUTTON_REMOVE_CHECKBOX = By.xpath(String.format(BUTTON_CHECKBOX_CONDITION_XPATH, "Remove"));
    private final By CONDITION_MESSAGE = By.xpath("//*[@id='message']");
    private final By INPUT_FIELD = By.xpath("//*[@id='input-example']//input");
    private final String BUTTON_INPUT_CONDITION_XPATH = "//*[@id='input-example']//button[contains(text(),'%s')]";
    private final By BUTTON_INPUT_ENABLE = By.xpath(String.format(BUTTON_INPUT_CONDITION_XPATH, "Enable"));
    private final By BUTTON_INPUT_DISABLE = By.xpath(String.format(BUTTON_INPUT_CONDITION_XPATH, "Disable"));

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(DYNAMIC_CONTROL_URL);
    }

    public boolean isCheckboxVisible() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX)));
        return driver.findElement(CHECKBOX).isDisplayed();
    }

    public boolean isCheckboxInvisible() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX));
        return driver.findElements(CHECKBOX).isEmpty();
    }

    public void clickAddCheckboxButton() {
        driver.findElement(BUTTON_ADD_CHECKBOX).click();
    }

    public void clickRemoveCheckboxButton() {
        driver.findElement(BUTTON_REMOVE_CHECKBOX).click();
    }

    public String getCheckboxConditionMessage() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(CONDITION_MESSAGE)));
        return driver.findElement(CONDITION_MESSAGE).getText();
    }

    public boolean isInputFieldDisabled() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(INPUT_FIELD)));
        return true;
    }

    public boolean isInputFieldEnabled() {
        getWebDriverWait(TIME_OUT_IN_SECONDS).until(ExpectedConditions.elementToBeClickable(INPUT_FIELD));
        return true;
    }

    public void clickEnableInputButton() {
        driver.findElement(BUTTON_INPUT_ENABLE).click();
    }

    public void clickDisableInputButton() {
        driver.findElement(BUTTON_INPUT_DISABLE).click();
    }
}
