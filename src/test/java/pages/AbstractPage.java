package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected static final String URL = "http://the-internet.herokuapp.com/";

    AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * usually contains driver.get(URL)
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
     * Find first {@code element} element on page else throw exception
     * @param element By element
     * @return first {@code element} element on page
     */
    protected WebElement findElement(By element) {
        return driver.findElement(element);
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

    /**
     * @param element By element
     * @return if element is selected true else false
     */
    protected boolean isSelected(By element) {
        return driver.findElement(element).isSelected();
    }
}