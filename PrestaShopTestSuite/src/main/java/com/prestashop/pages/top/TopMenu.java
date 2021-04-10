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

    public static By userAccount() { return By.cssSelector("#_desktop_user_info > div > a.account > span"); }







}








