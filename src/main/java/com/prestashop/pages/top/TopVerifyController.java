package com.prestashop.pages.top;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.top.TopMenu.userAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class TopVerifyController {

    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    public TopVerifyController userLoggedIn(String userName) {
        assertEquals(userName, driver.findElement(userAccount()).getText());
        return this;
    }


}
