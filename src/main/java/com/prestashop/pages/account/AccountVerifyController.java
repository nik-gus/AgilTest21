package com.prestashop.pages.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.account.AccountPage.notification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountVerifyController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public AccountVerifyController addressUpdated() {
        assertEquals("Address successfully updated!", driver.findElement(notification()).getText());
        return this;
    }
}
