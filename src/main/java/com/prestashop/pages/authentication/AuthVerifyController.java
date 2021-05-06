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
        assertTrue(alert.getAttribute("validationMessage").contains("email address."));

        return this;
    }

    public AuthVerifyController missingAfterAtEmail() {
        WebElement alert = driver.findElement(By.name("email"));
        assertTrue(alert.getAttribute("validationMessage").contains("Please enter"));

        return this;
    }

    public AuthVerifyController missingDotEmail() {
        WebElement alert = driver.findElement(alertMessage());
        assertEquals("Invalid format.", alert.getText());
        return this;
    }

    public AuthVerifyController shortPasswordFailed() {
        WebElement alert = driver.findElement(shortPasswordMessage());
        assertTrue(alert.getAttribute("validationMessage").contains("Please match"));
        return this;
    }

    public AuthVerifyController wrongBirthdayFailed() {
        WebElement alert = driver.findElement(alertMessage());
        assertEquals("Format should be 05/31/1970.", alert.getText());
        return this;
    }

    public AuthVerifyController emptyFieldFailed() {
        WebElement alert = null;
        String firstname = driver.findElement(By.name("firstname")).getAttribute("value");
        String lastname = driver.findElement(By.name("lastname")).getAttribute("value");
        String email = driver.findElement(By.name("email")).getAttribute("value");
        String password = driver.findElement(By.name("password")).getAttribute("value");
        if(firstname.isEmpty()){
            alert = driver.findElement(By.name("firstname"));
        }
        if(lastname.isEmpty()){
            alert = driver.findElement(By.name("lastname"));
        }
        if(email.isEmpty()){
            alert = driver.findElement(By.name("email"));
        }
        if(password.isEmpty()){
            alert = driver.findElement(By.name("password"));
        }
        assertTrue(alert.getAttribute("validationMessage").contains("Please fill"));
        return this;
    }

    public AuthVerifyController notAgreeFailed() {
        WebElement alert = driver.findElement(notAgreeMessage());
        assertTrue(alert.getAttribute("validationMessage").contains("Please"));
        return this;
    }

}
