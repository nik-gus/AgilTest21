package com.prestashop.pages.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.order.OrderPage.*;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class OrderActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public OrderActController enterAddress(String address) {
        driver.findElement(addressTextField())
                .sendKeys(address);
        return this;
    }

    public OrderActController enterPostalCode(String postalCode) {
        driver.findElement(postalCodeTextField())
                .sendKeys(postalCode);
        return this;
    }

    public OrderActController enterCity(String city) {
        driver.findElement(cityTextField())
                .sendKeys(city);
        return this;
    }

    public OrderActController continueToShipping()  {
        driver.findElement(addressesContinueButton())
                .click();
        return this;
    }

    public OrderActController continueToPayment() {
        driver.findElement(shippingContinueButton())
                .click();
        return this;
    }


    public OrderActController payByBankWire() {
        driver.findElement(payByBankWireRadioButton())
                .click();
        return this;
    }

    public OrderActController agreeToTerms() {
        driver.findElement(agreeToTermsCheckBox())
                .click();
        return this;
    }

    public OrderActController placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(paymentConfirmationButton()))
                .click();
        return this;
    }

}
