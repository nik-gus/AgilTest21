package com.prestashop.pages.top;

import com.prestashop.pages.authentication.AuthActController;
import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.top.TopMenu.*;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;


public class TopActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public TopActController selectSignInButton() {
        driver.findElement(By.partialLinkText("Sign in"))
                .click();
        return this;
    }

    public TopActController selectContactButton() {
        driver.findElement(contactUsLink())
                .click();
        return this;
    }

    public TopActController selectHomeLink() {
        driver.findElement(homeLink())
                .click();
        return this;
    }

    public TopActController selectClothes() {
        driver.findElement(clothesLink())
                .click();
        return this;
    }

    public CommonVerification andThen() {
        return getCommonVerification();
    }


}
