package com.prestashop.pages.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.user.UserPage.notification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserVerifyController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public UserVerifyController addressUpdated() {
        assertEquals("Address successfully updated!", driver.findElement(notification()).getText());
        return this;
    }
}
