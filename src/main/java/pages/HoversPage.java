package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class HoversPage extends AbstractPage {
    protected final static String HOVERS_URL = URL + "hovers";
    private final By PROFILES_XPATH = By.xpath("//*[@id='content']//*[contains(@class, 'example')]//*[contains(@class, 'figure')]");

    private By getProfileCaption(int numberOfProfile) {
        return By.xpath(String.format("//*[@id='content']//*[contains(@class, 'figure')][%s]//h5", numberOfProfile));
    }

    private By getProfileLink(int numberOfProfile) {
        return By.xpath(String.format("//*[@id='content']//*[contains(@class, 'figure')][%s]//a", numberOfProfile));
    }

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(HOVERS_URL);
    }

    public List<WebElement> getAllProfiles() {
        return driver.findElements(PROFILES_XPATH);
    }

    public List<String> getAllCaptions() {
        Actions actions = new Actions(driver);
        List<WebElement> profiles = getAllProfiles();
        int countOfProfiles = profiles.size();
        List<String> captions = new ArrayList<>();
        for (int i = 0; i < countOfProfiles; i++) {
            actions.moveToElement(profiles.get(i)).build().perform();
            captions.add(driver.findElement(getProfileCaption(i + 1)).getText());
        }
        return captions;
    }

    public String getAllProfileLinkContent(int numberOfProfile) {
        Actions actions = new Actions(driver);
        List<WebElement> profiles = getAllProfiles();
        actions.moveToElement(profiles.get(numberOfProfile)).build().perform();
        driver.findElement(getProfileLink(numberOfProfile + 1)).click();
        return driver.findElement(By.tagName("h1")).getText();
    }
}
