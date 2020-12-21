package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

public class TyposPage extends AbstractPage {

    protected final static String URL = AbstractPage.URL + "typos";

    private final By ParagraphWithRandomlyTypo = By.xpath("//*[contains(@class, 'example')]//p[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TyposPage openPage() {
        driver.get(URL);
        return this;
    }

    public boolean isParagraphContainsTypo() {
        return findElement(ParagraphWithRandomlyTypo).getText().contains("won,t");
    }

}