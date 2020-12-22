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

        JavascriptExecutor js = (JavascriptExecutor) driver;
        return String.valueOf(js.executeScript("return document.getElementsByTagName('input')[0].valueAsNumber"));
    }

    public boolean isInputFieldEmpty() {
        return getInputFieldText().equals("null");
    }

    public InputsPage sendToInputField(int count, CharSequence... chsq) {

        for (int i = 0; i < count; i++) {
            driver.findElement(INPUT_FIELD).sendKeys(chsq);
        }

        return this;
    }

}
