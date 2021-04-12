package com.prestashop.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonVerification {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    private CommonVerification() {
        //hidden
    }

    public static CommonVerification getCommonVerification() {
        return new CommonVerification();
    }

    public CommonVerification verifyUrlPath(String path) {
        URL url = null;
        try {
            url = new URL(driver.getCurrentUrl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;
        assertEquals(path, url.getPath());
        return this;
    }

    public CommonVerification verifyIsDisplayed(By element) {
        assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public CommonVerification verifyPageTitle(String title) {
        assertTrue(wait.until(ExpectedConditions.titleIs(title)),
                "ERROR: Page title should be '" +title +"'");
        return this;
    }




}
