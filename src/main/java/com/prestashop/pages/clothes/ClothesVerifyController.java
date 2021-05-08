package com.prestashop.pages.clothes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.clothes.ClothesPage.addedToCartConfirmationMessage;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClothesVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ClothesVerifyController successfullyAddedToShoppingCart() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(addedToCartConfirmationMessage()));
        assertTrue(element.getText().contains("Product successfully added to your shopping cart"));
        return this;
    }

    public ClothesVerifyController subPageMen() { //verifierar ny sida "Men", ej filter
        wait.until(ExpectedConditions.urlContains("4-men"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men");
        return this;
    }

    public ClothesVerifyController productsIsSortedByPriceLowToHigh() {
        wait.until(ExpectedConditions.urlContains("order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.price.asc");
        return this;
    }

    public ClothesVerifyController productsIsSortedByPriceHighToLow(){
        wait.until(ExpectedConditions.urlContains("order=product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.price.desc");
        return this;

    }
    public ClothesVerifyController productsIsSortedByNameAToZ(){
        wait.until(ExpectedConditions.urlContains("order=product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.name.asc");
        return this;
    }

    public ClothesVerifyController productsIsSortedByNameZToA(){
        wait.until(ExpectedConditions.urlContains("order=product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.name.desc");
        return this;
    }

    public ClothesVerifyController verifyWomen(){
        wait.until(ExpectedConditions.urlContains("5-women"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/5-women");
        return this;
    }

    public ClothesVerifyController verifyMen(){
        wait.until(ExpectedConditions.urlContains("4-men"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men");
        return this;
    }



    public ClothesVerifyController verifyAllClothesLowToHigh() {
        driver.findElement(By.className("js-search-link"));
        wait.until(ExpectedConditions.urlContains("order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/3-clothes?order=product.price.asc");
        return this;
    }

    public ClothesVerifyController verifyAllClothesHighToLow(){
        driver.findElement(By.className("js-search-link"));
        wait.until(ExpectedConditions.urlContains("order=product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/3-clothes?order=product.price.desc");
        return this;

    }
    public ClothesVerifyController verifyAllClothesATOZ(){
        driver.findElement(By.className("js-search-link")).getAttribute("Name, A to Z");
        wait.until(ExpectedConditions.urlContains("order=product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/3-clothes?order=product.name.asc");
        return this;
    }

    public ClothesVerifyController verifyAllClothesZTOA(){
        driver.findElement(By.className("js-search-link"));
        wait.until(ExpectedConditions.urlContains("order=product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/3-clothes?order=product.name.desc");
        return this;
    }



    public ClothesVerifyController verifyHummingbirdResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Hummingbird"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Hummingbird");
        return this;
    }

}
