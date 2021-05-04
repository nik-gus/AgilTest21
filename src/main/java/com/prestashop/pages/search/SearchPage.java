package com.prestashop.pages.search;

public class SearchPage {
    private SearchActController act;
    private SearchVerifyController verify;

    private SearchPage(SearchActController act, SearchVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static SearchPage getSearchPage() {
        return new SearchPage(new SearchActController(), new SearchVerifyController());
    }

    public SearchActController act() {
        return act;
    }
    public SearchVerifyController verify() {
        return verify;
    }

}
