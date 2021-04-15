package com.prestashop.pages.clothes;

import com.prestashop.utils.Color;
import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.clothes.ClothesPage.*;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class ClothesActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ClothesActController selectMen() {
        driver.findElement(By.partialLinkText("Men"))
                .click();
        return this;
    }

    public ClothesActController filterSize(Size size) {
        driver.findElement(By.xpath("//a[@class='_gray-darker search-link js-search-link'][contains(text(),'" +size +"')]"))
                .click();
        return this;
    }

    public ClothesActController selectArticleOfClothingByName(String name) {
        driver.findElement(By.cssSelector("img[alt='" + name +"']"))
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

    public ClothesActController selectSize(Size size) {
        driver.findElement(clothingSize(size))
                .click();
        return this;
    }

    public ClothesActController selectColor(Color color) {
        driver.findElement(clothingColor(color))
                .click();
        return this;
    }

    public ClothesActController addToCart() {
        driver.findElement(addToCartButton())
                .click();
        return this;
    }

    public void proceedToCart() {
        driver.findElement(By.xpath("//a[@class='btn btn-primary']"))
                .click();
    }


    public CommonVerification andThen() {
        return getCommonVerification();
    }

}
