package utils;

import java.io.IOException;

public class BrowserLoader {

    public static BrowserType browserType() throws IOException {
        String browserName = PropertiesReader.readProperty("browser.name");
        if (browserName.equals("chrome")) {
            return BrowserType.CHROME;
        } else if (browserName.equals("firefox")) {
            return BrowserType.FIREFOX;
        }
        return null;
    }
}


