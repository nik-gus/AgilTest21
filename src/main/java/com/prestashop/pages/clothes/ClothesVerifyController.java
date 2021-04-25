package com.prestashop.pages.clothes;

import com.prestashop.pages.top.TopVerifyController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.clothes.ClothesPage.addedToCartConfirmationMessage;
import static com.prestashop.pages.top.TopMenu.userAccount;
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


    public ClothesVerifyController verifyMen(String userName) {
        driver.findElement(By.partialLinkText("Men"));
        assertEquals("Men","Men");
        return this;
    }

    public ClothesVerifyController verifyLowToHigh() {
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, low to high","Price, low to high");
        return this;
    }

    public ClothesVerifyController verifyHighToLow(){
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, high to low","Price, high to low");
        return this;

    }
    public ClothesVerifyController verifyATOZ(){
        driver.findElement(By.className("js-search-link"));
        assertEquals("Name, A to Z","Name, A to Z");
        return this;

    }

    public ClothesVerifyController verifyZTOA(){
        driver.findElement(By.className("js-search-link"));
        assertEquals("Name, Z to A","Name, Z to A");
        return this;

    }

    public ClothesVerifyController verifySearchResults(){
        driver.findElement(By.className("h2"));
        assertEquals("Search results","Search results");
        return this;

    }

}
