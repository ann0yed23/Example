package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.BrowserLoader;
 import utils.DriverFactory;

import java.io.IOException;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() throws IOException {
        driver = new DriverFactory().createDriver(BrowserLoader.browserType());
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com/");
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
