package com.prestashop.pages.clothes;

import com.prestashop.pages.top.TopVerifyController;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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


    public ClothesVerifyController verifyMen() {
        driver.findElement(By.partialLinkText("Men"));
        assertEquals("Men","Men");
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("4-men"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men");


        return this;
    }

    public ClothesVerifyController verifyLowToHigh() {
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, low to high","Price, low to high");
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("order=product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.price.asc");

        return this;
    }

    public ClothesVerifyController verifyHighToLow(){
        driver.findElement(By.className("js-search-link"));
        assertEquals("Price, high to low","Price, high to low");
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("order=product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.price.desc");

        return this;

    }
    public ClothesVerifyController verifyATOZ(){
        driver.findElement(By.className("js-search-link")).getAttribute("Name, A to Z");
         String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("order=product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.name.asc");

/*
        if(URL.equals("http://40.76.27.113:8085/en/4-men?order=product.name.asc"))
        {
           System.out.println("http://40.76.27.113:8085/en/4-men?order=product.name.asc" +
                   "" + URL);

        }else
        {
            System.out.println("Landed in wrong URL"+
                 "" + URL);

        }
*/

        return this;

    }

    public ClothesVerifyController verifyZTOA(){
        driver.findElement(By.className("js-search-link"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("order=product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/4-men?order=product.name.desc");

        return this;

    }

    public ClothesVerifyController verifyHummingbirdResults(){
        driver.findElement(By.className("h2"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("search&s=Hummingbird"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Hummingbird");
        return this;

    }



}
