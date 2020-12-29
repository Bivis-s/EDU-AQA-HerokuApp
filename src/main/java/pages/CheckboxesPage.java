package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tools.PagesTools;

public class CheckboxesPage extends AbstractPage {
    protected static final String CHECKBOXES_URL = URL + "checkboxes";
    private final String FORM_CHECKBOXES_XPATH = "//*[@id='checkboxes']/input[%s]";

    private By getCheckboxByNumber(int numberOfCheckbox) {
        return By.xpath(String.format(FORM_CHECKBOXES_XPATH, numberOfCheckbox));
    }

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(CHECKBOXES_URL);
    }

    public boolean isCheckboxChecked(int checkboxNumber) {
        return driver.findElement(getCheckboxByNumber(checkboxNumber)).isSelected();
    }

    public void clickCheckbox(int checkboxNumber) {
        PagesTools.clickElementByCount(driver, getCheckboxByNumber(checkboxNumber), 1);
    }
}
