package com.prestashop.pages.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public CartVerifyController CheckThatCartIsEmpty(){
        assertEquals("There are no more items in your cart",driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/div/div[2]/span")).getText());
        return this;
    }
}
