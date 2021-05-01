package com.prestashop.pages.accessories;

public class AccessoriesPage {
    public static final String PAGE_TITLE_ACCESSORIES =
            "Accessories";

    private AccessoriesActController act;
    private AccessoriesVerifyController verify;

    private AccessoriesPage() {
        //hidden
    }

    private AccessoriesPage(AccessoriesActController act, AccessoriesVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    //static factory method
    public static AccessoriesPage getAccessoriesPage() {
        return new AccessoriesPage(new AccessoriesActController(), new AccessoriesVerifyController());
    }

    public AccessoriesActController act() {
        return act;
    }
    public AccessoriesVerifyController verify() {
        return verify;
    }

}
