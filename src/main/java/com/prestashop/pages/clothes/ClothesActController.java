package com.prestashop.pages.clothes;

import com.prestashop.utils.Color;
import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.clothes.ClothesPage.*;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClothesActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ClothesActController selectMen() {
        driver.findElement(By.partialLinkText("Men"))
                .click();
        return this;
    }

    public ClothesActController selectWomen() {
        driver.findElement(By.partialLinkText("Women"))
                .click();
        return this;
    }


    public ClothesActController ClickLowToHigh() {
        driver.findElement(By.partialLinkText("Price, low to high"))
                .click();
        return this;
    }

    public ClothesActController ClickHighToLow() {
        driver.findElement(By.partialLinkText("Price, high to low"))
                .click();
        return this;
    }

    public ClothesActController ClickNameAToZ() {
        driver.findElement(By.partialLinkText("Name, A to Z"))
                .click();
        return this;
    }

    public ClothesActController ClickNameZToA() {
        driver.findElement(By.partialLinkText("Name, Z to A"))
                .click();
        return this;
    }

    public ClothesActController filterSize(Size size) {
        driver.findElement(By.xpath("//a[@class='_gray-darker search-link js-search-link'][contains(text(),'" + size + "')]"))
                .click();
        return this;
    }

    public ClothesActController ClickRelevenceButton() {
        driver.findElement(By.className("products-sort-order"))
                .click();
        return this;
    }

    public ClothesActController ClickMen() {
        driver.findElement(By.id("category-4"))
                .click();
        return this;
    }

    public ClothesActController selectArticleOfClothingByName(String name) {
        driver.findElement(By.cssSelector("img[alt='" + name + "']"))
                .click();
        return this;
    }

    public ClothesActController selectFirstArticleOfClothing() {
        driver.findElement(firstArticle())
                .click();
        return this;
    }

    public ClothesActController selectLastArticleOfClothing() {
        int totalArticles = driver.findElements(By.tagName("article")).size();
        driver.findElement(lastArticle(totalArticles))
                .click();
        return this;
    }

    public ClothesActController chooseSize(Size size) {
        driver.findElement(clothingSize(size))
                .click();
        return this;
    }

    public ClothesActController chooseColor(Color color) {
        driver.findElement(clothingColor(color))
                .click();
        return this;
    }

    public ClothesActController addToCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for(int i =0; i<2;i++) {
            try {
                WebElement button = driver.findElement(addToCartButton());
                js.executeScript("arguments[0].click()", button);
                break;
            }
            catch(StaleElementReferenceException e) {
            }
        }
        return this;
    }

    public ClothesActController proceedToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCartInPopupButton()))
                .click();
        return this;
    }



    public CommonVerification andThen() {
        return getCommonVerification();
    }

}
