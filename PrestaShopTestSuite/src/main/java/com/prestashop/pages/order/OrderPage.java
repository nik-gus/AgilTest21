package com.prestashop.pages.order;

public class OrderPage {

    private OrderActController act;
    private OrderVerifyController verify;

    private OrderPage() {
        // hidden
    }

    private OrderPage(OrderActController act, OrderVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static OrderPage getOrderPage() {
        return new OrderPage(new OrderActController(), new OrderVerifyController());
    }

    public OrderActController act() { return act; }
    public OrderVerifyController verify() { return verify; }
}
