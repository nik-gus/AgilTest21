import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.art.ArtPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.art.ArtPage.getArtPage;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class SearchFunctionTest extends BaseTestClass {

    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();
    AccessoriesPage accessories = getAccessoriesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();
    ArtPage art = getArtPage();



    @Test
    @Description("As a User i would like to test search for Hummingbird, to check so that i can find all Humingbird products")
    void searchForHummingbird() {
        top.act()
                .searchForHummingbird()
                .clickSearch();
        clothes.verify()
                .verifyHummingbirdResults();
    }

    @Test
    @Description("As a User i would like to test search for Mug, to check so that i can find all Mug products")
    void searchForMug() {
        top.act()
                .searchForMug()
                .clickSearch();
        accessories.verify()
                .verifyMugResults();

    }

    @Test
    @Description("As a User i would like to test search for Pack, to check so that i can find all Pack products")
    void searchForPack() {
        top.act()
                .searchForPack()
                .clickSearch();
        art.verify()
                .verifyPackResults();
    }

    @Test
    @Description("As a User i would like to test search for Paper, to check so that i can find all Paper products")
    void searchForPaper() {
        top.act()
                .searchForPaper()
                .clickSearch();
        art.verify()
                .verifyPaperResults();
    }

    @Test
    @Description("As a User i would like to test search for Colour, to check so that i can find all Colour products")
    void searchForColour() {
        top.act()
                .searchForColour()
                .clickSearch();
        art.verify()
                .verifyColourResults();
    }

    @Test
    @Description("As a User i would like to test search for Ceramics, to check so that i can find all Ceramics products")
    void searchForCeramics() {
        top.act()
                .searchForCeramics()
                .clickSearch();
        art.verify()
                .verifyCeramicsResults();
    }
}
