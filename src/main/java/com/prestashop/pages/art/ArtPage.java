package com.prestashop.pages.art;

import org.openqa.selenium.By;

public class ArtPage {

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

}