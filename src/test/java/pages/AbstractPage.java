package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractPage {
    public WebDriver driver;
    public static final String URL = "http://the-internet.herokuapp.com/";

    AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * contains driver.get(URL);
     */
    public abstract AbstractPage openPage();

    /**
     * Finding 1 {@code element} and click it {@code counter} times
     *
     * @param element By element
     * @param counter Count of clicks
     * @return this object
     */
    protected AbstractPage clickElement(By element, int counter) {

        WebElement button = driver.findElement(element);

        for (int i = 0; i < counter; i++) {
            button.click();
        }
        return this;
    }

    /**
     * Find all {@code element} elements on page
     *
     * @param element By element
     * @return {@code int} of found elements
     */
    protected List<WebElement> findElements(By element) {
        return driver.findElements(element);
    }
}