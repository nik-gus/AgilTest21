package com.prestashop.pages.clothes;

import com.prestashop.utils.Color;
import org.openqa.selenium.By;

public class ClothesPage {
    public static final String PAGE_TITLE_CLOTHES =
            "Clothes";
    public static final String HUMMINGBIRD_PRINTED_T_SHIRT =
            "Hummingbird printed t-shirt";
    public static final String HUMMINGBIRD_PRINTED_SWEATER =
            "Brown bear printed sweater";

    private ClothesActController act;
    private ClothesVerifyController verify;

    private ClothesPage() {
        //hidden
    }

    private ClothesPage(ClothesActController act, ClothesVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static ClothesPage getClothesPage() {
        return new ClothesPage(new ClothesActController(), new ClothesVerifyController());
    }

    public ClothesActController act() {
        return act;
    }
    public ClothesVerifyController verify() {
        return verify;
    }

    public static By clothesHeader() {
        return By.id("js-product-list-header");
    }
    public static By clothesBreadcrumb() {
        return By.xpath("//span[contains(text(),'Clothes')]");
    }
    public static By menBreadcrumb() {
        return By.xpath("//span[contains(text(),'Men')]");
    }
    public static By sizeMFilter() {
        return By.cssSelector("#js-active-search-filters > ul > li");
    }

    public static By articleByOrderOfAppearance(int order) {
        return By.cssSelector("[data-id-product='" + order +"']");
    }

    public static By clothingSize(Size size) {
        return By.cssSelector("#group_1 > option:nth-child(" +size +")");
    }
    public static By clothingColor(Color color) {
        return By.xpath("//li[2]//label[1]//input[" +color +"]");
    }

    public static By proceedToCartButtonInPopup(){
        return By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a"); }
    public static By addToCartButton() {
        //return By.cssSelector("button[data-button-action='add-to-cart']");
        return By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button");
    }

    public static By addedToCartConfirmationMessage() {
        return By.id("myModalLabel");
    }


}
