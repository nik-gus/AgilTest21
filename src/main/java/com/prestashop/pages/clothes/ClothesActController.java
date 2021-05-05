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

public class ClothesActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public CommonVerification andThen() {
        return getCommonVerification();
    }

    private void clickStaleElement(By element) {
        var attempts = 0;
        while(attempts < 2) {
            try {
                driver.findElement(element).click();
                break;
            } catch(StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }

    }

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

    public ClothesActController clickLowToHigh() {
        driver.findElement(By.partialLinkText("Price, low to high"))
                .click();
        return this;
    }

    public ClothesActController clickHighToLow() {
        driver.findElement(By.partialLinkText("Price, high to low"))
                .click();
        return this;
    }

    public ClothesActController clickNameAToZ() {
        driver.findElement(By.partialLinkText("Name, A to Z"))
                .click();
        return this;
    }

    public ClothesActController clickNameZToA() {
        driver.findElement(By.partialLinkText("Name, Z to A"))
                .click();
        return this;
    }

    public ClothesActController filterSize(Size size) {
        driver.findElement(By.xpath("//a[@class='_gray-darker search-link js-search-link'][contains(text(),'" + size + "')]"))
                .click();
        return this;
    }

    public ClothesActController clickRelevenceButton() {
        driver.findElement(By.className("products-sort-order"))
                .click();
        return this;
    }

    public ClothesActController clickMen() {
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
        driver.findElement(articleByOrderOfAppearance(1))
                .click();
        return this;
    }

    public ClothesActController selectLastArticleOfClothing() {
        int totalArticles = driver.findElements(By.tagName("article")).size();
        driver.findElement(articleByOrderOfAppearance(totalArticles))
                .click();
        return this;
    }

    public ClothesActController chooseSize(Size size) {
        driver.findElement(clothingSize(size))
                .click();
        return this;
    }

    public ClothesActController chooseColor(Color color) {
      clickStaleElement(clothingColor(color));
      return this;
    }

    public ClothesActController addToCart() {
        clickStaleElement(addToCartButton());
        return this;
    }

    public ClothesActController proceedToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCartButtonInPopup()))
                .click();
        return this;
    }

}
