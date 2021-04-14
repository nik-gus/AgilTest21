package com.prestashop.pages.order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public OrderVerifyController orderConfirmed() {
        WebElement confirmation = driver.findElement(By.xpath("//h3[@class='h1 card-title']"));
        assertTrue(confirmation.getText().contains("YOUR ORDER IS CONFIRMED"));
        return this;
    }



}
