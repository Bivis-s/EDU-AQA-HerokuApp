package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class AbstractTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().driverVersion("87.0.4280.88").setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
