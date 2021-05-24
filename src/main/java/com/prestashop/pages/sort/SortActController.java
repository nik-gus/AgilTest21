package com.prestashop.pages.sort;

import com.prestashop.pages.art.ArtActController;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.sortByDropDown;
import static com.prestashop.pages.art.ArtPage.sortByLink;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class SortActController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public SortActController selectSortArtBy(String sortBy) {
        wait.until(ExpectedConditions.elementToBeClickable
                (driver.findElement(sortByLink(sortBy))))
                .click();
        return this;
    }

    public SortActController clickSortByDropDown() {
        driver.findElement(sortByDropDown())
                .click();
        return this;
    }
}
