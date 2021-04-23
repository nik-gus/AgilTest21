package com.prestashop.pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.order.OrderPage.orderConfirmationMessage;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public OrderVerifyController orderConfirmed() {
        WebElement confirmation = driver.findElement(orderConfirmationMessage());
        assertTrue(confirmation.getText().contains("YOUR ORDER IS CONFIRMED"));
        return this;
    }

    public OrderVerifyController missingAtEmail() {
        WebElement alert = driver.findElement(By.name("email"));
        assertTrue(alert.getAttribute("validationMessage").contains("Please include an '@' in the email address."));
        return this;
    }

}
