package com.prestashop.pages.cart;

public class CartPage {

    private CartActController act;
    private CartVerifyController verify;

    private CartPage() {
        // hidden
    }

    private CartPage(CartActController act, CartVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static CartPage getCartPage() {
        return new CartPage((new CartActController()), new CartVerifyController());
    }

    public CartActController act() {
        return act;
    }

    public CartVerifyController verify() {
        return verify;
    }

}
