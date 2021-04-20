package com.prestashop.pages.cart;

public class CartPage {

    public static final String PAGE_TITLE_CART =
            "Cart";

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
