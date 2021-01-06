package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected static final String URL = "http://the-internet.herokuapp.com/";
    protected WebDriverWait webDriverWait;

    public WebDriverWait getWebDriverWait(int timeout) {
        return webDriverWait = new WebDriverWait(driver, timeout);
    }

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * usually contains driver.get(URL) and returns this object
     */
    public abstract void openPage();
}