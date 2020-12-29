package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tools.TestTools;

import java.io.File;
import java.util.HashMap;

public abstract class AbstractTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void initTest() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().driverVersion("87.0.4280.88").setup();

        // Create Chrome Prefs (set download dir)
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", new File("src/test/resources/test_res/download").getAbsolutePath());

        driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito")
                .setExperimentalOption("prefs", chromePrefs));
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
