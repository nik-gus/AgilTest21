package com.prestashop.pages.accessories;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class AccessoriesActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();


    public AccessoriesActController clickLowToHigh() {
        driver.findElement(By.partialLinkText("Price, low to high"))
                .click();
        return this;
    }

    public AccessoriesActController clickHighToLow() {
        driver.findElement(By.partialLinkText("Price, high to low"))
                .click();
        return this;
    }

    public AccessoriesActController clickNameAToZ() {
        driver.findElement(By.partialLinkText("Name, A to Z"))
                .click();
        return this;
    }

    public AccessoriesActController clickNameZToA() {
        driver.findElement(By.partialLinkText("Name, Z to A"))
                .click();
        return this;
    }

    public AccessoriesActController clickRelevenceButton() {
        driver.findElement(By.className("products-sort-order"))
                .click();
        return this;
    }
    public AccessoriesActController clickMen() {
        driver.findElement(By.id("category-4"))
                .click();
        return this;
    }

    public AccessoriesActController filterByHome() {
        WebElement homeFilter =
        driver.findElements(By.className("ps-shown-by-js")).get(0);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", homeFilter);
        return this;
    }

    public AccessoriesActController filterByStationery() {
        WebElement stationeryFilter =
        driver.findElements(By.className("ps-shown-by-js")).get(1);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", stationeryFilter);
        return this;
    }

    public AccessoriesActController filterByColourWhite() {
        WebElement colorFilter =
                driver.findElements(By.className("color")).get(0);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", colorFilter);
        return this;
    }

    public AccessoriesActController filterByColourBlack() {
        WebElement colorFilter =
        driver.findElements(By.className("color")).get(1);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", colorFilter);
        return this;
    }

    public AccessoriesActController filterByCeramic() {
        driver.findElements(By.partialLinkText("Ceramic")).get(0)
                .click();
        return this;
    }

    public AccessoriesActController filterByPolyester() {
        driver.findElements(By.partialLinkText("Polyester")).get(0)
                .click();
        return this;
    }

    public AccessoriesActController filterByRecycle() {
        driver.findElements(By.partialLinkText("Recycled cardboard")).get(0)
                .click();
        return this;
    }


    public AccessoriesActController filterByProperty120Pages() {
        driver.findElements(By.partialLinkText("120 pages")).get(0)
                .click();
        return this;
    }

    public AccessoriesActController filterByPropertyRemovable() {
        driver.findElements(By.partialLinkText("Removable cover")).get(0)
                .click();
        return this;
    }

    public AccessoriesActController filterByPropertyByBrandGraphic() {
        driver.findElements(By.partialLinkText("Graphic Corner")).get(0)
                .click();
        return this;
    }

    public AccessoriesActController filterByPropertyByBrandStudio() {
        driver.findElements(By.partialLinkText("Studio Design")).get(0)
                .click();
        return this;
    }


}
