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
        wait.until(ExpectedConditions.urlContains("6-accessories?order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.price.asc");
        return this;
    }


    public AccessoriesVerifyController verifyHighToLow() {
        driver.findElement(By.className("js-search-link"));
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

    public AccessoriesVerifyController verifyCategoryByHome(){
        driver.findElements(By.className("ps-shown-by-js")).get(0);
        wait.until(ExpectedConditions.urlContains("Home+Accessories"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Categories-Home+Accessories");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByStationery(){
        driver.findElements(By.className("ps-shown-by-js")).get(0);
        wait.until(ExpectedConditions.urlContains("Stationery"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Categories-Stationery");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByColourWhite(){
        driver.findElements(By.className("color")).get(0);
        wait.until(ExpectedConditions.urlContains("Color-White"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Color-White");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByColourBlack(){
        driver.findElements(By.className("color")).get(1);
        wait.until(ExpectedConditions.urlContains("Color-Black"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Color-Black");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByCeramic(){
        driver.findElements(By.partialLinkText("Ceramic"));
        wait.until(ExpectedConditions.urlContains("Composition-Ceramic"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Ceramic");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByPolyester(){
        driver.findElements(By.partialLinkText("Polyester"));
        wait.until(ExpectedConditions.urlContains("Composition-Polyester"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Polyester");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByRecycle(){
        driver.findElements(By.partialLinkText("Recycled cardboard"));
        wait.until(ExpectedConditions.urlContains("Recycled+cardboard"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Recycled+cardboard");
        return this;
    }
    public AccessoriesVerifyController verifyCategoryBy120Pages(){
        driver.findElements(By.partialLinkText("120 pages"));
        wait.until(ExpectedConditions.urlContains("Property-120+pages"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Property-120+pages");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByRemovable(){
        driver.findElements(By.partialLinkText("Removable cover"));
        wait.until(ExpectedConditions.urlContains("Property-Removable+cover"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Property-Removable+cover");
        return this;
    }


    public AccessoriesVerifyController verifyCategoryByBrandGraphic(){
        driver.findElements(By.partialLinkText("Graphic Corner"));
        wait.until(ExpectedConditions.urlContains("Brand-Graphic+Corner"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Brand-Graphic+Corner");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByBrandStudio(){
        driver.findElements(By.partialLinkText("Studio Design"));
        wait.until(ExpectedConditions.urlContains("Brand-Studio+Design"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Brand-Studio+Design");
        return this;
    }
}
