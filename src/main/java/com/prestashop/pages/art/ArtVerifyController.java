package com.prestashop.pages.art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.*;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArtVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ArtVerifyController verifyPackResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Pack"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Pack");
        return this;
    }

    public ArtVerifyController verifyPaperResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Paper"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Paper");
        return this;
    }

    public ArtVerifyController verifyColourResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Colour"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Colour");
        return this;

    }

    public ArtVerifyController verifyCeramicsResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Ceramics"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Ceramics");
        return this;
    }

    public ArtVerifyController urlContainsFilter(String fraction) {
        assertTrue(wait.until(ExpectedConditions.urlContains
                (fraction.replaceAll("\\s","+"))));
        return this;
    }

    public ArtVerifyController urlContainsSortOrder(String sortBy) {
        switch (sortBy) {
            case "Name, A to Z" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_NAME_ASC)));
            case "Name, Z to A" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_NAME_DESC)));
            case "Price, low to high" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_PRICE_ASC)));
            case "Price, high to low" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_PRICE_DESC)));
            default -> throw new IllegalStateException("Unexpected sort order: " + sortBy);
        }
        return this;
    }

    public ArtVerifyController filterIsActive(String filter) {
        assertTrue(driver.findElement(activeSearchFilter())
                .getText().contains(filter));
        return this;
    }

    public ArtVerifyController artProductsIsSortedBy(String sortBy) {
        assertTrue(wait.until(ExpectedConditions.attributeContains
                (currentSortBy(), "text", sortBy)));
        return this;
    }

}
