package com.prestashop.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.*;

public class SearchVerifyController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public SearchVerifyController verifyItem(String item){
        assertTrue(driver.getCurrentUrl().contains(item));
        String product = driver.findElement(By.id("products")).getText();
        if (product.contains("There")){
            assertTrue(product.contains("There"));
        }
        else{
            product = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
            assertEquals(product, "Sorry for the inconvenience.");
        }
        return this;
    }

}
