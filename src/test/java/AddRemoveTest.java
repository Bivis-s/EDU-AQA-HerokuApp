import TestTemplate.AddRemoveTemplate;
import Values.Values;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveTest {
    private WebDriver driver;
    private AddRemoveTemplate addRemoveTemplate;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        addRemoveTemplate = new AddRemoveTemplate(driver);
        driver.get(Values.SITE_ADD_REMOVE);
    }

    @Test
    public void Add2Test() {
        // add 2 elements
        addRemoveTemplate.addElement(2);
        // check if 2 element added
        Assert.assertEquals(addRemoveTemplate.findDeletableElements(), 2);
    }

    @Test
    public void Add2Delete1Test() {
        // add 2 elements
        addRemoveTemplate.addElement(2);
        // check if 2 element added
        Assert.assertEquals(addRemoveTemplate.findDeletableElements(), 2);

        // remove 1 element
        addRemoveTemplate.deleteElements(1);
        // check if there is now only an element
        Assert.assertEquals(addRemoveTemplate.findDeletableElements(), 1);
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.close();
        }
    }
}
