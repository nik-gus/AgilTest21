import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.Size.MEDIUM;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

public class ProductInCartTest extends BaseTestClass {

    TopMenu top = getTopMenu();
    OrderPage order = getOrderPage();
    ClothesPage clothes = ClothesPage.getClothesPage();
    CartPage cart = getCartPage();

    @Test
    void testAddClothesToCart() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectLastArticleOfClothing()
                .selectSize(MEDIUM)
                .addToCart();
        clothes.verify()
                .productAddedToShoppingCart();
    }

}
