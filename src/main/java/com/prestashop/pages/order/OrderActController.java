package com.prestashop.pages.order;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;

import static com.prestashop.pages.order.OrderPage.*;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class OrderActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public String generateEmail() {
        return LocalDateTime.now().hashCode() + "@test.com";
    }

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

    public OrderActController payByCheck() {
        driver.findElement(payByCheckRadioButton())
                .click();
        return this;
    }

    public OrderActController agreeToTermsOfService() {
        driver.findElement(agreeToTermsOfServiceCheckBox())
                .click();
        return this;
    }

    public OrderActController placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable(paymentConfirmationButton()))
                .click();
        return this;
    }

    public OrderActController selectSocialTitleMrs() {
        driver.findElement(socialTitleMrs())
                .click();
        return this;
    }

    public OrderActController selectSocialTitleMr() {
        driver.findElement(socialTitleMr())
                .click();
        return this;
    }

    public OrderActController enterFirstName(String firstName) {
        driver.findElement(firstNameField())
                .sendKeys(firstName);
        return this;
    }

    public OrderActController enterLastName(String lastName) {
        driver.findElement(lastNameField())
                .sendKeys(lastName);
        return this;
    }

    public OrderActController enterEmail(String email) {
        driver.findElement(emailField())
                .sendKeys(email);
        return this;
    }

    public OrderActController enterRandomizedEmail() {
        driver.findElement(emailField())
                .sendKeys(generateEmail());
        return this;
    }

    public OrderActController agreeToTermsAndConditions() {
        driver.findElement(agreeToTermsAndConditionsCheckBox())
                .click();
        return this;
    }

    public OrderActController continueToAdresses() {
        driver.findElement(personalInformationContinueButton())
                .click();
        return this;
    }

    public OrderActController selctSignIn() {
        driver.findElement(signInLink())
                .click();
        return this;
    }

    public OrderActController enterPassword(String password) {
        driver.findElement(passwordField())
                .sendKeys(password);
        return this;
    }

    public OrderActController signIn() {
        driver.findElement(personalInformationSignInContinueButton())
                .click();
        return this;
    }

    public CommonVerification andThen() {
        return getCommonVerification();
    }


    public OrderActController confirmAddress() {
        driver.findElement(confirmAddressButton())
                .click();
        return this;
    }
}
