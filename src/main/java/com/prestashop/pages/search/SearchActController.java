package com.prestashop.pages.search;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class SearchActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public CommonVerification andThen() {
        return getCommonVerification();
    }

    public SearchActController typeSearch(String item) {
        driver.findElement(By.className("ui-autocomplete-input")).sendKeys(item);
        return this;
    }

    public SearchActController clickSearch(){
        driver.findElement(By.className("search")).click();
        return this;
    }

}
