package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver createDriver(BrowserType browserType) {

        if(browserType==BrowserType.CHROME){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
    }
        else if(browserType==BrowserType.FIREFOX)
        {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        return null;
    }
}
