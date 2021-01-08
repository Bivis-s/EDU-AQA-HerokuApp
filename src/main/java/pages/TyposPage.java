package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends AbstractPage {
    protected final static String TYPOS_URL = URL + "typos";
    private final By paragraphWithRandomlyTypo = By.xpath("//*[contains(@class, 'example')]//p[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openPage() {
        driver.get(TYPOS_URL);
    }

    public boolean isParagraphContainsTypo() {
        return driver.findElement(paragraphWithRandomlyTypo).getText().contains("won,t");
    }
}