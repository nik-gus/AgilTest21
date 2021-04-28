package com.prestashop.pages.art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();


    public ArtVerifyController verifyPackResults(){
        driver.findElement(By.className("h2"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("search&s=Pack"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Pack");
        return this;

    }


    public ArtVerifyController verifyPaperResults(){
        driver.findElement(By.className("h2"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("search&s=Paper"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Paper");
        return this;

    }

    public ArtVerifyController verifyColourResults(){
        driver.findElement(By.className("h2"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("search&s=Colour"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Colour");
        return this;

    }

    public ArtVerifyController verifyCeramicsResults(){
        driver.findElement(By.className("h2"));
        String URL = driver.getCurrentUrl();
        //WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.urlContains("search&s=Ceramics"));
        assertEquals(driver.getCurrentUrl(), "http://40.76.27.113:8085/en/search?controller=search&s=Ceramics");
        return this;

    }
}
