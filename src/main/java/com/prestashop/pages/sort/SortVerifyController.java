package com.prestashop.pages.sort;

import com.prestashop.pages.art.ArtVerifyController;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.stream.Collectors;

import static com.prestashop.pages.art.ArtPage.*;
import static com.prestashop.pages.art.ArtPage.SORT_ORDER_PRICE_DESC;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortVerifyController {
    private WebDriver driver = getDriver();
    private WebDriverWait wait = getWebDriverWait();

    private List<String> getProductNames() {
        List<WebElement> products = driver.findElements(By.cssSelector("#js-product-list > div > article"));
        return products.stream()
                .map(e -> e.findElement(By.tagName("h2")).getText())
                .collect(toList());
    }

    private List<Double> getProductPrices() {
        List<WebElement> products = driver.findElements(By.cssSelector("#js-product-list > div > article"));
        return products.stream()
                .map(e -> e.findElement(By.className("price")).getText().substring(2))
                .map(Double::valueOf).collect(Collectors.toList());
    }

    public SortVerifyController urlContainsSortOrder(String sortBy) {
        switch (sortBy) {
            case "Name, A to Z" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_NAME_ASC)));
            case "Name, Z to A" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_NAME_DESC)));
            case "Price, low to high" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_PRICE_ASC)));
            case "Price, high to low" -> assertTrue(wait.until(ExpectedConditions.urlContains(SORT_ORDER_PRICE_DESC)));
            default -> throw new IllegalStateException("Unexpected sort order: " + sortBy);
        }
        return this;
    }

    public SortVerifyController dropDownListDisplaysCurrentSortOrder(String sortBy) {
        assertTrue(wait.until(ExpectedConditions.attributeContains
                (currentSortBy(), "text", sortBy)));
        return this;
    }

    public SortVerifyController productsIsSortedBy(String sortBy) {
        switch (sortBy) {
            case "Name, A to Z" ->
                    assertThat(getProductNames())
                            .isSortedAccordingTo(naturalOrder());
            case "Name, Z to A" ->
                    assertThat(getProductNames())
                            .isSortedAccordingTo(reverseOrder());
            case "Price, low to high" ->
                    assertThat(getProductPrices())
                            .isSortedAccordingTo(naturalOrder());
            case "Price, high to low" ->
                    assertThat(getProductPrices())
                            .isSortedAccordingTo(reverseOrder());
            default -> throw new IllegalStateException("Unexpected sort order: " + sortBy);
        }
        return this;
    }


}
