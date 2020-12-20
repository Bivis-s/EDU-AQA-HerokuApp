package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage extends AbstractPage {

    private final String URL = AbstractPage.URL + "/dropdown";
    private final By DROPDOWN = By.xpath("//*[@id='dropdown']");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DropdownPage openPage() {
        driver.get(URL);
        return this;
    }

    private Select getDropdown(By element) {
        return new Select(findElement(element));
    }

    public List<WebElement> getEnabledOptionsInDropdown() {

        List<WebElement> options = new ArrayList<>();

        for (WebElement option : getDropdown(DROPDOWN).getOptions()) {
            if (option.isEnabled()) {
                options.add(option);
            }
        }

        return options;
    }

    /**
     * @param options list of options
     * @return list of attributes "value" of each option
     */
    public List<Integer> getDropdownIntegerValues(List<WebElement> options) {

        List<Integer> values = new ArrayList<>();

        for (WebElement option : options) {
                values.add(Integer.valueOf(option.getAttribute("value")));
        }

        return values;
    }

    public void selectOption(int indexOfOption) {
        getEnabledOptionsInDropdown()
                .get(indexOfOption)
                .click();
    }

    public boolean isOptionSelected(int indexOfOption) {
        return getEnabledOptionsInDropdown()
                .get(indexOfOption)
                .isSelected();
    }


}
