package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesTools {

    /**
     * Finding an {@code element} and click it {@code count} times
     *
     * @param element By element
     * @param count   Count of clicks
     */
    public static void clickElementByCount(WebDriver driver, By element, int count) {
        WebElement button = driver.findElement(element);

        for (int i = 0; i < count; i++) {
            button.click();
        }
    }
}
