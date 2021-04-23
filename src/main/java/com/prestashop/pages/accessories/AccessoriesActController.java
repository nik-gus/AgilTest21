package com.prestashop.pages.accessories;

import com.prestashop.pages.clothes.ClothesActController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class AccessoriesActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();


    public AccessoriesActController ClickLowToHigh() {
        driver.findElement(By.partialLinkText("Price, low to high"))
                .click();
        return this;
    }

    public AccessoriesActController ClickHighToLow() {
        driver.findElement(By.partialLinkText("Price, high to low"))
                .click();
        return this;
    }
    public AccessoriesActController ClickNameAToZ() {
        driver.findElement(By.partialLinkText("Name, A to Z"))
                .click();
        return this;
    }

    public AccessoriesActController ClickNameZToA() {
        driver.findElement(By.partialLinkText("Name, Z to A"))
                .click();
        return this;
    }

    public AccessoriesActController ClickRelevenceButton() {
        driver.findElement(By.className("products-sort-order"))
                .click();
        return this;
    }
    public AccessoriesActController ClickMen() {
        driver.findElement(By.id("category-4"))
                .click();
        return this;
    }


}
