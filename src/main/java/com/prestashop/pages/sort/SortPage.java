package com.prestashop.pages.sort;

public  class SortPage {

    private SortActController act;
    private SortVerifyController verify;

    private SortPage() {}

    private SortPage(SortActController act, SortVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static SortPage getSortPage() {
        return  new SortPage(new SortActController(), new SortVerifyController());
    }

    public SortActController act() { return act; }
    public SortVerifyController verify() { return verify; }

}
