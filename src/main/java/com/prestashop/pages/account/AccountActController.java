package com.prestashop.pages.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class AccountActController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    //EDIT ADDRESS
    public AccountActController clickOnAddressesLink(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/a[2]")).click();
        return this;
    }

    //CLICK UPDATE BUTTON
    public AccountActController clickOnUpdateLink(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/" +
                "article/div[2]/a[1]/span")).click();
        return this;
    }
    //CHANGE ADDRESS1
    public AccountActController changeAddress1(String address1){
        driver.findElement(By.name("address1")).clear();
        driver.findElement(By.name("address1")).sendKeys(address1);
        return this;
    }

    //CLICK ON SAVE BUTTON
    public AccountActController clickOnSaveButton(){
        driver.findElement(By.cssSelector("#content > div > div > form > footer > button")).click();
        return this;
    }

    //CREATE A NEW ADDRESS
    public AccountActController createANewAddress(){
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[3]/a")).click();
        return this;
    }




}
