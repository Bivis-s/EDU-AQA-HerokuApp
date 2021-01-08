package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tools.PagesTools;

public class AddRemovePage extends AbstractPage {
    protected static final String ADD_REMOVE_URL = URL + "add_remove_elements/";
    private final By BUTTON_ADD_ELEMENT = By.xpath("//*[@onclick='addElement()']");
    private final By BUTTON_DELETE_ELEMENT = By.xpath("//*[@onclick='deleteElement()']");

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(ADD_REMOVE_URL);
    }

    public void addElementByCount(int count) {
        PagesTools.clickElementByCount(driver, BUTTON_ADD_ELEMENT, count);
    }

    public void removeElement(int count) {
        PagesTools.clickElementByCount(driver, BUTTON_DELETE_ELEMENT, count);
    }

    /**
     * Find all {@code element} elements on page
     *
     * @return {@code int} of found elements
     */
    public int getCountOfDeletableElements() {
        return driver.findElements(BUTTON_DELETE_ELEMENT).size();
    }
}
