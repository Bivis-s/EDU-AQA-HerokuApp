package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class HoversPage extends AbstractPage {

    protected final static String URL = AbstractPage.URL + "hovers";

    private final By PROFILES_XPATH = By.xpath("//*[@id='content']//*[contains(@class, 'example')]//*[contains(@class, 'figure')]");

    private By getProfileBy(int numberOfProfile) {
        return By.xpath(String.format("//*[@id='content']//*[contains(@class, 'figure')][%s]//h5", numberOfProfile));
    }

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
    public HoversPage openPage() {
        driver.get(URL);
        return this;
    }

    public List<WebElement> getAllProfiles() {
        return findElements(PROFILES_XPATH);
    }

    public List<String> getAllCaptions() {

        Actions actions = new Actions(driver);

        List<WebElement> profiles = getAllProfiles();
        int countOfProfiles = profiles.size();
        List<String> captions = new ArrayList<>();

        for (int i = 0; i < countOfProfiles; i++) {

            actions.moveToElement(profiles.get(i)).build().perform();

            captions.add(
                    findElement(
                            getProfileCaption(i + 1))
                            .getText());
        }

        return captions;
    }

    public String getAllProfileLinksContent(int numberOfProfile) {

        Actions actions = new Actions(driver);

        List<WebElement> profiles = getAllProfiles();

        actions.moveToElement(profiles
                .get(numberOfProfile))
                .build()
                .perform();

        findElement(
                getProfileLink(numberOfProfile + 1))
                .click();

        return findElement(By.tagName("h1")).getText();
    }


}
