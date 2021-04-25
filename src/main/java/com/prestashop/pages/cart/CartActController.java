package com.prestashop.pages.cart;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class CartActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public CartActController proceedToCheckout() {
        driver.findElement(By.xpath("//a[@class='btn btn-primary']"))
                .click();
        return this;
    }

    public CartActController ContinueShopping(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button/span/i"))
                .click();
        return this;
    }

    public CartActController RemoveThingInCart(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[3]")).click();
        return this;
    }


    public CommonVerification andThen() {
        return getCommonVerification();
    }

}
