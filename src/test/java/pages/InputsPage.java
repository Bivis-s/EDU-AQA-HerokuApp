package pages;

import org.openqa.selenium.*;

public class InputsPage extends AbstractPage {

    protected static final String URL = AbstractPage.URL + "inputs";
    private final By INPUT_FIELD = By.xpath("//*[contains(@class, 'example')]/input[@type='number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage() {
        driver.get(URL);
        return this;
    }

    public String getInputFieldText() {
        return findElement(INPUT_FIELD).getAttribute("value");
    }

    public String getInputFieldTextByJs() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement webElement = findElement(INPUT_FIELD);

        return String.valueOf(jsExecutor.executeScript("return arguments[0].value", webElement));
    }

    public boolean isInputFieldEmpty() {
        return getInputFieldText().equals("");
    }

    public InputsPage sendToInputField(int count, CharSequence... chsq) {

        for (int i = 0; i < count; i++) {
            findElement(INPUT_FIELD).sendKeys(chsq);
        }

        return this;
    }

}
