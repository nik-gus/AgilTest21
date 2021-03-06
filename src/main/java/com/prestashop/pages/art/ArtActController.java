package com.prestashop.pages.art;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.sortByDropDown;
import static com.prestashop.pages.art.ArtPage.sortByLink;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class ArtActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public CommonVerification andThen() {
        return getCommonVerification();
    }



    public ArtActController selectFilter(String filter) {
        WebElement filterElement = driver.findElement(sortByLink(filter));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", filterElement);
        wait.until(ExpectedConditions.urlContains(filter.replaceAll("\\s","+")));
        return this;
    }

}
