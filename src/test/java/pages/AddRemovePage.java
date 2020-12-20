package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends AbstractPage {

    private static final String URL = AbstractPage.URL + "add_remove_elements/";
    private static final By BUTTON_ADD_ELEMENT = By.xpath("//*[@onclick='addElement()']");
    private static final By BUTTON_DELETE_ELEMENT = By.xpath("//*[@onclick='deleteElement()']");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AddRemovePage openPage() {
        driver.get(URL);
        return this;
    }

    public AddRemovePage addElement(int count) {
        clickElement(AddRemovePage.BUTTON_ADD_ELEMENT, count);
        return this;
    }

    public AddRemovePage removeElement(int count) {
        clickElement(BUTTON_DELETE_ELEMENT, count);
        return this;
    }

    /**
     * Find all {@code element} elements on page
     *
     * @return {@code int} of found elements
     */
    public int getCountOfDeletableElements() {
        return findElements(BUTTON_DELETE_ELEMENT).size();
    }
}
