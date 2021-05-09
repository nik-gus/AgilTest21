import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.clothes.ClothesPage.PAGE_TITLE_CLOTHES;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class SortClothesTest extends BaseTestClass {
    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();

    @Test
    @Description("As a User i would like to test Sort option, so that clothes are sorted by price low to high")
    void testSortClothesLowToHigh() {
        top.act()
                .selectClothes()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectMen(); //Obs, klickar på översta länken, ej filter
        clothes.verify()
                .subPageMen();
        clothes.act()
                .clickRelevanceButton()
                .clickLowToHigh();
        clothes.verify()
                .verifyDropDownPriceLowToHigh()
                .productsIsSortedByPriceLowToHigh();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that clothes are sorted by price High to Low")
    void testSortClothesHighToLow() {
        top.act()
                .selectClothes()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectMen();
        clothes.verify()
                .subPageMen();
        clothes.act()
                .clickRelevanceButton()
                .clickHighToLow();
        clothes.verify()
                .verifyDropDownPriceHighToLow()
                .productsIsSortedByPriceHighToLow();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that clothes are sorted by name A to Z")
    void testSortClothesNameATOZ() {
        top.act()
                .selectClothes()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectMen();
        clothes.verify()
                .subPageMen();
        clothes.act()
                .clickRelevanceButton()
                .clickNameAToZ();
        clothes.verify()
                .verifyDropDownAtoZ()
                .productsIsSortedByNameAToZ();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that clothes are sorted by name Z to A")
    void testSortClothesNameZTOA() {
        top.act()
                .selectClothes()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectMen();
        clothes.verify()
                .subPageMen();
        clothes.act()
                .clickRelevanceButton()
                .clickNameZToA();
        clothes.verify()
                .verifyDropDownZtoA()
                .productsIsSortedByNameZToA();
    }

}