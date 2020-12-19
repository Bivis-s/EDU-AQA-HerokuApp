package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends AbstractPage {
    public static final By BUTTON_ADD_ELEMENT = By.xpath("//*[@onclick='addElement()']");
    public static final By BUTTON_DELETE_ELEMENT = By.xpath("//*[@onclick='deleteElement()']");
    public static final String URL = AbstractPage.URL + "add_remove_elements/";

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }
}
