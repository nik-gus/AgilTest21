package com.prestashop.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
    private static final String MAC = "mac";
    private static final String WIN = "win";

    private static final String GECKO_PROPERTY = "webdriver.gecko.driver";
    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";

    private static final String GECKO_MAC_PATH_FILE = "src/main/driverStore/geckodriver_mac";
    private static final String CHROME_MAC_PATH_FILE = "src/main/driverStore/chromedriver_mac";

    private static final String GECKO_WIN_PATH_FILE = "src/main/driverStore/geckodriver_win.exe";
    private static final String CHROME_WIN_PATH_FILE = "src/main/driverStore/chromedriver_win.exe";

    private static WebDriver driver;
    private static WebDriverWait wait;


    private DriverFactory() {
        //prevent instantiation
    }

    public static WebDriver getDriver() {
        // use current driver instance, if there is one
        if (driver != null) {
            return driver;
        }

        String driverProperty = System.getProperty("WebDriver");

        // if no driver parameter is set, create default driver (Chrome)
        if (driverProperty == null) {
           setSystemPropertyForChrome();
            driver = new ChromeDriver();
            return driver;
        }

        // if driver parameter is set (i.e. -DWebDriver=xxxx is used)
        switch (driverProperty) {
            case "Chrome" -> {
                setSystemPropertyForChrome();
                driver = new ChromeDriver();
                return driver;
            }
            case "Firefox" -> {
                setSystemPropertyForFirefox();
                driver = new FirefoxDriver();
                return driver;
            }
            default -> throw new IllegalArgumentException("No '" + driver + "' driver available.");
        }
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getDriver(), 10);
        }
        return wait;
    }

    private static void setSystemPropertyForChrome() {
        if (System.getProperty("os.name").toLowerCase().contains(MAC)) {
            System.setProperty(CHROME_PROPERTY, CHROME_MAC_PATH_FILE);
        } else if (System.getProperty("os.name").toLowerCase().contains(WIN)) {
            System.setProperty(CHROME_PROPERTY, CHROME_WIN_PATH_FILE);
        }
    }

    private static void setSystemPropertyForFirefox() {
        if (System.getProperty("os.name").toLowerCase().contains(MAC)) {
            System.setProperty(GECKO_PROPERTY, GECKO_MAC_PATH_FILE);
        } else if (System.getProperty("os.name").toLowerCase().contains(WIN)) {
            System.setProperty(GECKO_PROPERTY, GECKO_WIN_PATH_FILE);
        }
    }






}
