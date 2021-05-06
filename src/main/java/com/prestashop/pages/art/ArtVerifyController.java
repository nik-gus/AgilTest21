package com.prestashop.pages.art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.activeSearchFilter;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArtVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();


    public ArtVerifyController verifyPackResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Pack"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Pack");
        return this;
    }


    public ArtVerifyController verifyPaperResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Paper"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Paper");
        return this;

    }

    public ArtVerifyController verifyColourResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Colour"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Colour");
        return this;

    }

    public ArtVerifyController verifyCeramicsResults(){
        wait.until(ExpectedConditions.urlContains("search&s=Ceramics"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Ceramics");
        return this;
    }


    public ArtVerifyController urlContains(String fraction) {
        assertTrue(wait.until(ExpectedConditions.urlContains
                (fraction.replaceAll("\\s","+"))));
        return this;
    }

    public ArtVerifyController filterIsActive(String filter) {
        assertTrue(driver.findElement(activeSearchFilter())
                .getText().contains(filter));
        return this;
    }


    public ArtVerifyController verifySortAToZPage(){
        wait.until(ExpectedConditions.urlContains("product.name.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/9-art?order=product.name.asc");
        return this;
    }

    public ArtVerifyController verifySortZToAPage(){
        wait.until(ExpectedConditions.urlContains("product.name.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/9-art?order=product.name.desc");
        return this;
    }

    public ArtVerifyController verifySortLowToHighPricePage(){
        wait.until(ExpectedConditions.urlContains("product.price.asc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/9-art?order=product.price.asc");
        return this;
    }

    public ArtVerifyController verifySortHighToLowPricePage(){
        wait.until(ExpectedConditions.urlContains("product.price.desc"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/9-art?order=product.price.desc");
        return this;
    }

}
