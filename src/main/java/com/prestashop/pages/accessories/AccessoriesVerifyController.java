package com.prestashop.pages.accessories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessoriesVerifyController {


    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public AccessoriesVerifyController verifyLowToHigh() {
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, low to high", "Price, low to high");
        wait.until(ExpectedConditions.urlContains("6-accessories?order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.price.asc");
        return this;
    }


    public AccessoriesVerifyController verifyHighToLow() {
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, high to low", "Price, high to low");
        wait.until(ExpectedConditions.urlContains("order=product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.price.desc");

        return this;
    }

    public AccessoriesVerifyController verifyATOZ() {
        driver.findElement(By.className("js-search-link")).getAttribute("Name, A to Z");
        wait.until(ExpectedConditions.urlContains("order=product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.name.asc");
        return this;

    }

    public AccessoriesVerifyController verifyZTOA(){
        driver.findElement(By.className("js-search-link"));
        wait.until(ExpectedConditions.urlContains("order=product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.name.desc");
        return this;
    }

    public AccessoriesVerifyController verifyMugResults(){
        driver.findElement(By.className("h2"));
        wait.until(ExpectedConditions.urlContains("search&s=Mug"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Mug");
        return this;
    }

}
