import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class sortAccessoriesTest extends BaseTestClass{
    TopMenu top = getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by price low to high")

    void testSortAccessoriesLowToHigh() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .ClickRelevenceButton()
                .ClickLowToHigh();
        accessories.verify()
                .verifyLowToHigh();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by price high to low")
    void testSortAccessoriesHighToLow() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .ClickRelevenceButton()
                .ClickHighToLow();
        accessories.verify()
                .verifyHighToLow();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by name A to Z")
    void testSortAccessoriesNameATOZ() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .ClickRelevenceButton()
                .ClickNameAToZ();
        accessories.verify()
                .verifyATOZ();



    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by name Z to A")
    void testSortAccessoriesNameZTOA() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .ClickRelevenceButton()
                .ClickNameZToA();
        accessories.verify()
                .verifyZTOA();
    }

}
