package com.prestashop.pages.user;

public class UserPage {
    private UserActController act;
    private UserVerifyController verify;

    private UserPage() {}

    private UserPage(UserActController act, UserVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static UserPage getUserPage() {
        return new UserPage(new UserActController(), new UserVerifyController());
    }

    public UserActController act() { return act; }
    public UserVerifyController verify() { return verify; }



}
