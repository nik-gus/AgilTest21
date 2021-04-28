package com.prestashop.pages.accessories;

import com.prestashop.pages.clothes.ClothesActController;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.clothes.ClothesVerifyController;

public class AccessoriesPage {
    public static final String PAGE_TITLE_CLOTHES =
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
