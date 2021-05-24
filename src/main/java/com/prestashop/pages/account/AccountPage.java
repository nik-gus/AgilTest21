package com.prestashop.pages.account;

import org.openqa.selenium.By;

public class AccountPage {
    private AccountActController act;
    private AccountVerifyController verify;

    private AccountPage() {}

    private AccountPage(AccountActController act, AccountVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static AccountPage getUserPage() {
        return new AccountPage(new AccountActController(), new AccountVerifyController());
    }

    public AccountActController act() { return act; }
    public AccountVerifyController verify() { return verify; }

    public static By notification() { return By.cssSelector("#notifications > div > article"); }

}
