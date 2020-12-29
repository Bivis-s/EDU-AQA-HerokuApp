package pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected static final String URL = "http://the-internet.herokuapp.com/";

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * usually contains driver.get(URL) and returns this object
     */
    public abstract void openPage();
}