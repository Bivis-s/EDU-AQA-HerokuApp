package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends AbstractPage{

    protected static final String URL = AbstractPage.URL + "checkboxes";
    private final String FORM_CHECKBOXES_XPATH = "//*[@id='checkboxes']/input[%s]";

    private By getCheckbox(int numberOfCheckbox) {
        return By.xpath(String.format(FORM_CHECKBOXES_XPATH, numberOfCheckbox));
    }

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CheckboxesPage openPage() {
        driver.get(URL);
        return this;
    }

    public boolean isCheckboxChecked(int checkboxNumber) {
        return isSelected(getCheckbox(checkboxNumber));
    }

    public CheckboxesPage clickCheckbox(int checkboxNumber) {
        clickElement(getCheckbox(checkboxNumber), 1);
        return this;
    }
}
