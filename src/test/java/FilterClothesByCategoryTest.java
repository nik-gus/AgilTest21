import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class FilterClothesByCategoryTest extends BaseTestClass {
    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();

    @Test
    @Description("As a User i would like to test Filter option in Clothes, so that I can filter women by Category")
    void clickOnFilterWomen() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectWomen();
        clothes.verify()
                .verifyWomen();
    }

    @Test
    @Description("As a User i would like to test Filter option in Clothes, so that I can filter Men by Category")
    void clickOnFilterMen() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectMen();
        clothes.verify()
                .verifyMen();
    }

}

