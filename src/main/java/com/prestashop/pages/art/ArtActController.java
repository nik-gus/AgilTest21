package com.prestashop.pages.art;

import com.prestashop.utils.CommonVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.top.TopMenu.cartLink;
import static com.prestashop.utils.CommonVerification.getCommonVerification;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class ArtActController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public ArtActController selectMattPaper() {
        driver.findElement(By.partialLinkText("Matt paper"))
                .click();
        return this;
    }

    public ArtActController selectSortArtFromAtoZ() {
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button"))
                .click();
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[2]"))
                .click();
        return this;
    }

    public ArtActController selectSortArtFromZtoA() {
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button"))
                .click();
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[3]"))
                .click();
        return this;
    }

    public ArtActController selectSortArtFromLowToHighPrice() {
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button"))
                .click();
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[4]"))
                .click();
        return this;
    }

    public ArtActController selectSortArtFromHighToLowPrice() {
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/button"))
                .click();
        driver.findElement(By.xpath("/html/body/main/section/div/div[2]/section/section/div[1]/div/div[2]/div/div[1]/div/a[5]"))
                .click();
        return this;
    }


    public ArtActController selectFilter(String filter) {
        WebElement filterElement = driver.findElement(By.partialLinkText(filter));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", filterElement);
        wait.until(ExpectedConditions.urlContains(filter.replaceAll("\\s","+")));
        return this;
    }

    public CommonVerification andThen() {
        return getCommonVerification();
    }

}
