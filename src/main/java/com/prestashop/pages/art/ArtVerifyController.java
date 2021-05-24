package com.prestashop.pages.art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.*;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArtVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ArtVerifyController urlContainsFilter(String fraction) {
        assertTrue(wait.until(ExpectedConditions.urlContains
                (fraction.replaceAll("\\s","+"))));
        return this;
    }

    public ArtVerifyController filterIsActive(String filter) {
        assertTrue(driver.findElement(activeSearchFilter())
                .getText().contains(filter));
        return this;
    }




}
