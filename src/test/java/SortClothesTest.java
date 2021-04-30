import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.PAGE_TITLE_CLOTHES;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
class SortClothesTest extends BaseTestClass {

    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();



    @Test
    @Description("As a User i would like to test Sort option, so that clothes are sorted by price low to high")

    void testSortClothesLowToHigh() {
        top.act()
                .selectClothes()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectMen();
        clothes.verify()
                .verifyMen();
        clothes.act()
                .ClickRelevenceButton()
                .ClickLowToHigh();
        clothes.verify()
                .verifyLowToHigh();

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
                .verifyMen();
        clothes.act()
                .ClickRelevenceButton()
                .ClickHighToLow();
        clothes.verify()
                .verifyHighToLow();
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
                .verifyMen();
        clothes.act()
                .ClickRelevenceButton()
                .ClickNameAToZ();
        clothes.verify()
                .verifyATOZ();
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
                .verifyMen();
        clothes.act()
                .ClickRelevenceButton()
                .ClickNameZToA();
        clothes.verify()
                .verifyZTOA();


    }



}