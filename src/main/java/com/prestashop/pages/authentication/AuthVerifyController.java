package com.prestashop.pages.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.authentication.AuthPage.alertMessage;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public AuthVerifyController authenticationFailed() {
        WebElement alert = driver.findElement(alertMessage());
        assertEquals("Authentication failed.", alert.getText());
        return this;
    }

}
