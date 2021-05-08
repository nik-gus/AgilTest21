package com.prestashop.pages.accessories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessoriesVerifyController {


    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public AccessoriesVerifyController verifyLowToHigh() {
        wait.until(ExpectedConditions.urlContains("6-accessories?order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.price.asc");
        return this;
    }


    public AccessoriesVerifyController verifyHighToLow() {
        wait.until(ExpectedConditions.urlContains("order=product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.price.desc");

        return this;
    }

    public AccessoriesVerifyController verifyATOZ() {
        wait.until(ExpectedConditions.urlContains("order=product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.name.asc");
        return this;

    }

    public AccessoriesVerifyController verifyZTOA(){
        wait.until(ExpectedConditions.urlContains("order=product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?order=product.name.desc");
        return this;
    }

    public AccessoriesVerifyController verifyMugResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Mug"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Mug");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByHome(){
        wait.until(ExpectedConditions.urlContains("Home+Accessories"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Categories-Home+Accessories");
        return this;
    }


    public AccessoriesVerifyController verifyCategoryByStationery(){
        wait.until(ExpectedConditions.urlContains("Stationery"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Categories-Stationery");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByColourWhite(){
        wait.until(ExpectedConditions.urlContains("Color-White"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Color-White");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByColourBlack(){
        wait.until(ExpectedConditions.urlContains("Color-Black"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Color-Black");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByCeramic(){
        wait.until(ExpectedConditions.urlContains("Composition-Ceramic"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Ceramic");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByPolyester(){
        wait.until(ExpectedConditions.urlContains("Composition-Polyester"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Polyester");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByRecycle(){
        wait.until(ExpectedConditions.urlContains("Recycled+cardboard"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Composition-Recycled+cardboard");
        return this;
    }
    public AccessoriesVerifyController verifyCategoryBy120Pages(){
        wait.until(ExpectedConditions.urlContains("Property-120+pages"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Property-120+pages");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByRemovable(){
        wait.until(ExpectedConditions.urlContains("Property-Removable+cover"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Property-Removable+cover");
        return this;
    }


    public AccessoriesVerifyController verifyCategoryByBrandGraphic(){
        wait.until(ExpectedConditions.urlContains("Brand-Graphic+Corner"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Brand-Graphic+Corner");
        return this;
    }

    public AccessoriesVerifyController verifyCategoryByBrandStudio(){
        wait.until(ExpectedConditions.urlContains("Brand-Studio+Design"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/6-accessories?q=Brand-Studio+Design");
        return this;
    }

    public AccessoriesVerifyController verifyByfilterHome() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Categories: Home Accessories\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByfilterStationery() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Categories: Stationery\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterWhiteColour() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Color: White\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterBlackColour() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Color: Black\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterCeramic() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Composition: Ceramic\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterPolyester() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Composition: Polyester\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterRecycle() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Composition: Recycled cardboard\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilter120Pages() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Property: 120 pages\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterRemovable() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Property: Removable cover\n" +
                "\uE5CD");
        return this;
    }


    public AccessoriesVerifyController verifyByFilterBrandGraphic() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Brand: Graphic Corner\n" +
                "\uE5CD");
        return this;
    }

    public AccessoriesVerifyController verifyByFilterBrandStudio() {

        String filter = driver.findElement(By.xpath("//*[@id='js-active-search-filters']/ul/li")).getText();
        assertEquals(filter, "Brand: Studio Design\n" +
                "\uE5CD");
        return this;
    }

}
