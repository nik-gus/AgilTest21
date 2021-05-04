package com.prestashop.pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.order.OrderPage.*;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

public class OrderVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public OrderVerifyController orderConfirmed() {
        WebElement confirmation = driver.findElement(orderConfirmationMessage());
        assertTrue(confirmation.getText().contains("YOUR ORDER IS CONFIRMED"));
        return this;
    }

    public OrderVerifyController emailRejected() {
        WebElement emailField = driver.findElement(By.name("email"));
        if (emailField.getAttribute("validationMessage").isEmpty()) {
            assertEquals("Invalid format.", driver.findElement(alertMessageEmail()).getText());
        }
        else {
            assertFalse(emailField.getAttribute("validationMessage").isBlank());
        }
        return this;
    }

    public void agreeToTermsErrorMessageDisplayed() {
        WebElement alert = driver.findElement(personalInformationAgreeToTerms());
        assertTrue(alert.getAttribute("validationMessage").contains("Please"));
    }

}
