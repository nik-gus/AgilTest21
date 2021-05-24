package com.prestashop.pages.top;

import org.openqa.selenium.By;

public class TopMenu {

    private TopActController act;
    private TopVerifyController verify;

    private TopMenu() {
        // hidden, to prevent instantiation
    }

    private TopMenu(TopActController act, TopVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static TopMenu getTopMenu() {
        return new TopMenu(new TopActController(), new TopVerifyController());
    }

    public TopActController act() {
        return act;
    }
    public TopVerifyController verify() {
        return verify;
    }

    public static By userAccount(){
        return By.cssSelector("#_desktop_user_info > div > a.account > span");
    }

    public static By contactUsLink(){
        return  By.id("contact-link");
    }
    public static By homeLink() {
        return By.cssSelector("#_desktop_logo > h1 > a > img");
    }
    public static By clothesLink() {
        return By.id("category-3");
    }
    public static By accessoriesLink() {
        return By.id("category-6");
    }
    public static By artLink() { return By.id("category-9"); }
    public static By pageLink(String linkText) {return By.partialLinkText(linkText); }
    public static By cartLink() { return By.cssSelector("#_desktop_cart > div > div > a"); }




}








