package TestTemplate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveTemplate {
    private final WebDriver webDriver;

    public AddRemoveTemplate(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void addElement(int counter) {
        WebElement button = webDriver.findElement(By.xpath("//*[@onclick='addElement()']"));

        for (int i = 0; i < counter; i++) {
            button.click();
        }
    }

    public int findDeletableElements() {
        List<WebElement> webElementList = webDriver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        return webElementList.size();
    }

    public void deleteElements(int counter) {
        WebElement button = webDriver.findElement(By.xpath("//*[@onclick='deleteElement()']"));

        for (int i = 0; i < counter; i++) {
            button.click();
        }
    }
}
