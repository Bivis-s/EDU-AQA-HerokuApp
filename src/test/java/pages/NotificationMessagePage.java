package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationMessagePage extends AbstractPage {

    protected final static String URL = AbstractPage.URL + "notification_message_rendered";

    private final By LOAD_MESSAGE_LINK = By.xpath("//a[contains(text(),'Click here')]");
    private final By NOTIFICATION = By.xpath("//*[@id='flash']");
    private final By NOTIFICATION_CLOSE_BUTTON = By.xpath("//*[@id='flash']//*[contains(@class,'close')]");

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public NotificationMessagePage openPage() {
        driver.get(URL);
        return this;
    }

    public boolean isNotificationDisplayed() {

        return driver.findElements(NOTIFICATION)
                .size() > 0;
    }

    public NotificationMessagePage clickLoadMessageLink() {

        driver.findElement(LOAD_MESSAGE_LINK)
                .click();

        return this;

    }

    public NotificationMessagePage closeNotification() {

        driver.findElement(NOTIFICATION_CLOSE_BUTTON)
                .click();

        // wait for Message closing
        WebDriverWait driverWait = new WebDriverWait(driver, 3);
        driverWait.until(ExpectedConditions.invisibilityOf(driver.findElement(NOTIFICATION)));

        return this;

    }

    public String getNotificationText() {

        return driver.findElement(NOTIFICATION).getText();

    }

}
