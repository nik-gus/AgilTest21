package com.prestashop.pages.art;

import org.openqa.selenium.By;

public class ArtPage {

    public static final String SORT_ORDER_NAME_ASC =
            "product.name.asc";
    public static final String SORT_ORDER_NAME_DESC =
            "product.name.desc";
    public static final String SORT_ORDER_PRICE_ASC =
            "product.price.asc";
    public static final String SORT_ORDER_PRICE_DESC =
            "product.price.desc";

    private ArtActController act;
    private ArtVerifyController verify;

    private ArtPage() {}

    private ArtPage(ArtActController act, ArtVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static ArtPage getArtPage() {
        return new ArtPage(new ArtActController(), new ArtVerifyController());
    }

    public ArtActController act() { return act; }
    public ArtVerifyController verify() { return verify; }

    public static By activeSearchFilter() { return By.id("js-active-search-filters"); }

    public static By sortByDropDown() { return By.className("products-sort-order"); }

    public static By currentSortBy() { return By.cssSelector("a[class='select-list current js-search-link']"); }
    public static By sortByLink(String linkText) { return By.partialLinkText(linkText); }


}