package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationMessagePage extends AbstractPage {
    protected final static String NOTIFICATION_MESSAGE_URL = URL + "notification_message_rendered";
    private final By LOAD_MESSAGE_LINK = By.xpath("//a[contains(text(),'Click here')]");
    private final By NOTIFICATION = By.xpath("//*[@id='flash']");
    private final By NOTIFICATION_CLOSE_BUTTON = By.xpath("//*[@id='flash']//*[contains(@class,'close')]");

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(NOTIFICATION_MESSAGE_URL);
    }

    public boolean isNotificationDisplayed() {
        return driver.findElements(NOTIFICATION).size() > 0;
    }

    public void clickLoadMessageLink() {
        driver.findElement(LOAD_MESSAGE_LINK).click();
    }

    public void closeNotification() {
        driver.findElement(NOTIFICATION_CLOSE_BUTTON).click();

        // wait for Message closing
        WebDriverWait driverWait = new WebDriverWait(driver, 3);
        driverWait.until(ExpectedConditions.invisibilityOf(driver.findElement(NOTIFICATION)));
    }

    public String getNotificationText() {
        return driver.findElement(NOTIFICATION).getText();
    }

}
