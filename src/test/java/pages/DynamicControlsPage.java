package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.dynamic_controls_test.Values;

public class DynamicControlsPage extends AbstractPage{
    protected static final String DYNAMIC_CONTROL_URL = URL + "dynamic_controls";
    private final By CHECKBOX =
            By.xpath("//*[contains(@id,'checkbox-example')]//input[contains(@type,'checkbox')]");
    private final By BUTTON_SWAP_CHECKBOX_CONDITION =
            By.xpath("//*[contains(@id,'checkbox-example')]//button[contains(text(),'Remove')" +
                    " or contains(text(),'Add')]");
    private final By CONDITION_MESSAGE = By.xpath("//*[@id='message']");

    private final By INPUT_FIELD = By.xpath("//*[@id='input-example']//input");
    private final By BUTTON_SWAP_INPUT_CONDITION = By.xpath("//*[@id='input-example']//button");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(DYNAMIC_CONTROL_URL);
    }

    public boolean isCheckboxVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Values.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX)));
        return driver.findElements(CHECKBOX).size() != 0;
    }

    public boolean isCheckboxInvisible() {
        WebDriverWait wait = new WebDriverWait(driver, Values.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(CHECKBOX));
        return driver.findElements(CHECKBOX).size() == 0;
    }

    public void clickButtonSwapCheckboxCondition() {
        driver.findElement(BUTTON_SWAP_CHECKBOX_CONDITION).click();
    }

    public String getCheckboxConditionMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Values.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(CONDITION_MESSAGE)));
        return driver.findElement(CONDITION_MESSAGE).getText();
    }

    public boolean isInputFieldDisabled() {
        WebDriverWait wait = new WebDriverWait(driver, Values.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(INPUT_FIELD)));
        return true;
    }

    public boolean isInputFieldEnabled() {
        WebDriverWait wait = new WebDriverWait(driver, Values.TIME_OUT_IN_SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(INPUT_FIELD));
        return true;
    }

    public void clickButtonSwapInputCondition() {
        driver.findElement(BUTTON_SWAP_INPUT_CONDITION).click();
    }
}
