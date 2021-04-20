package com.prestashop.pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class UserVerifyController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();
}
