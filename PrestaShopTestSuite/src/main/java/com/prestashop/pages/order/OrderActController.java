package com.prestashop.pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class OrderActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public OrderActController enterCity(String city) {
        driver.findElement(By.name("city"))
                .sendKeys(city);
        return this;
    }

    public OrderActController enterPostalCode(String postalCode) {
        driver.findElement(By.name("postcode"))
                .sendKeys(postalCode);
        return this;
    }

    public OrderActController selectContinue()  {
        driver.findElement(By.cssSelector("#delivery-address > div > footer > button"))
                .click();
        return this;
    }

    public OrderActController confirmShipping() {
        driver.findElement(By.name("confirmDeliveryOption"))
                .click();
        return this;
    }

    public OrderActController payByBankWire() {
        driver.findElement(By.id("payment-option-2"))
                .click();
        return this;
    }

    public OrderActController agreeToTerms() {
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"))
                .click();
        return this;
    }

    public OrderActController placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button")))
                .click();
        return this;
    }

}
