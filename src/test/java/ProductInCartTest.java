import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.Size.MEDIUM;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class ProductInCartTest extends BaseTestClass {

    TopMenu top = getTopMenu();
    ClothesPage clothes = ClothesPage.getClothesPage();
    CartPage cart = getCartPage();

    @Test
    void testAddClothesToCart() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectLastArticleOfClothing()
                .chooseSize(MEDIUM)
                .addToCart();
        clothes.verify()
                .successfullyAddedToShoppingCart();

        //BÖR DELAS UPP I TVÅ TESTFALL HÄR

        cart.act()
                .continueShopping();
        top.act()
                .selectCart();
        cart.act()
                .removeThingInCart();
        cart.verify()
                .checkThatCartIsEmpty();
    }

}
