package com.prestashop.pages.authentication;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;


public class AuthActController {

    public WebDriver driver = getDriver();
    public WebDriverWait wait = getWebDriverWait();

    public String generateEmail() {
        return LocalDateTime.now().hashCode() + "@test.com";
    }

    public AuthActController selectCreateAccountLink() {
        driver.findElement(noAccountLink())
                .click();
        return this;
    }

    public AuthActController selectSocialTitleMr() {
        driver.findElement(socialTitleMr())
                .click();
        return this;
    }
    public AuthActController selectSocialTitleMrs() {
        driver.findElement(socialTitleMrs())
                .click();
        return this;
    }
    public AuthActController enterFirstName(String firstName) {
        driver.findElement(firstNameField())
                .sendKeys(firstName);
        return this;
    }

    public AuthActController enterLastName(String lastName) {
        driver.findElement(lastNameField())
                .sendKeys(lastName);
        return this;
    }

    public AuthActController enterEmail(String email) {
        driver.findElement(emailField())
                .sendKeys(email);
        return this;
    }

    public AuthActController enterRandomizedEmail() {
        driver.findElement(emailField())
                .sendKeys(generateEmail());
        return this;
    }

    public AuthActController enterPassword(String password) {
        driver.findElement((passwordField()))
                .sendKeys(password);
        return this;
    }

    public AuthActController enterBirthday(String birthday) {
        driver.findElement(By.name("birthday"))
                .sendKeys(birthday);
        return this;
    }
    public AuthActController selectReceiveOffers() {
        driver.findElement(receiveOffersCheckbox())
                .click();
        return this;
    }
    public AuthActController subscribeToNewsletter() {
        driver.findElement(subscribeToNewsletterCheckbox())
                .click();
        return this;
    }

    public AuthActController agreeToTerms() {
        driver.findElement(agreeToTermsCheckBox())
                .click();
        return this;
    }

    public AuthActController saveAccount() { //returnera annat??
        driver.findElement(submitButton())
                .click();
        return this;
    }

    public AuthActController signIn() {
        driver.findElement(signInButton())
                .click();
        return this;
    }

    public CommonVerification andThen() {
        return getCommonVerification();
    }

}
