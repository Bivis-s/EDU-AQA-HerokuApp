package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected static final String URL = "http://the-internet.herokuapp.com/";

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * usually contains driver.get(URL) and returns this object
     */
    public abstract AbstractPage openPage();

    /**
     * Finding an {@code element} and click it {@code count} times
     *
     * @param element By element
     * @param count Count of clicks
     * @return this object
     */
    protected AbstractPage clickElement(By element, int count) {

        WebElement button = driver.findElement(element);

        for (int i = 0; i < count; i++) {
            button.click();
        }
        return this;
    }

    /**
     * Click {@code WebElement element} {@code count} times
     *
     * @param element WebElement
     * @param count Count of clicks
     * @return this object
     */
    protected AbstractPage clickElement(WebElement element, int count) {

        for (int i = 0; i < count; i++) {
            element.click();
        }
        return this;
    }

}