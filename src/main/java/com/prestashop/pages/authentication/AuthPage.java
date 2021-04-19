package com.prestashop.pages.authentication;

import org.openqa.selenium.By;

public class AuthPage {

    public static final String TEST_USER_EMAIL =
            "tolvan@mail.com";
    public static final String TEST_USER_PASSWORD =
            "tolvan";

    private AuthActController act;
    private AuthVerifyController verify;

    private AuthPage() {
        // hidden, to prevent instantiation
    }

    private AuthPage(AuthActController act, AuthVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static AuthPage getAuthPage() {
        return new AuthPage(new AuthActController(), new AuthVerifyController());
    }

    public AuthActController act() {
        return act;
    }
    public AuthVerifyController verify() {
        return verify;
    }


    public static By noAccountLink() {
        return By.xpath("//div[@class='no-account']");
    }

    /* CREATE ACCOUNT ELEMENTS */
    //possible refactoring to seperate abstract page class
    public static By socialTitleMr() { return By.xpath("//*[@id='customer-form']/section/div[1]/div[1]/label[1]/span/input"); }
    public static By socialTitleMrs() { return By.xpath("//*[@id='customer-form']/section/div[1]/div[1]/label[2]/span/input"); }
    public static By firstNameField() { return By.name("firstname"); }
    public static By lastNameField() { return By.name("lastname"); }
    public static By emailField() { return By.name("email"); }
    public static By passwordField() { return By.name("password"); }
    public static By agreeToTermsCheckBox() { return By.name("psgdpr"); }
    public static By submitButton() { return By.cssSelector("[data-link-action='save-customer']"); }

    /* LOGIN ELEMENTS */
    public static By signInButton() { return By.id("submit-login"); }

    /* ALERTS */
    public static By alertMessage() { return By.className("alert-danger"); }
    public static By shortPasswordMessage() { return By.name("password"); }
    public static By notAgreeMessage() { return By.name("psgdpr"); }




}
