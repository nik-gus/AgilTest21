package com.prestashop.pages.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

public class AuthVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public AuthVerifyController authenticationFailed() {
        WebElement alert = driver.findElement(alertMessage());
        assertEquals("Authentication failed.", alert.getText());
        return this;
    }

    public AuthVerifyController emailExistFailed() {
        WebElement alert = driver.findElement(alertMessage());
        assertEquals("The email is already used, please choose another one or sign in", alert.getText());
        return this;
    }

    public AuthVerifyController missingAtEmail() {
        WebElement alert = driver.findElement(By.name("email"));
        assertTrue(alert.getAttribute("validationMessage").contains("Please include an '@' in the email address."));
        return this;
    }

    public AuthVerifyController shortPasswordFailed() {
        WebElement alert = driver.findElement(shortPasswordMessage());
        assertEquals("Please match the requested format.", alert.getAttribute("validationMessage"));
        return this;
    }

    public AuthVerifyController notAgreeFailed() {
        WebElement alert = driver.findElement(notAgreeMessage());
        assertEquals("Please check this box if you want to proceed.", alert.getAttribute("validationMessage"));
        return this;
    }

}
