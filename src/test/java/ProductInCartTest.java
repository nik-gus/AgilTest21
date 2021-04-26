import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.clothes.Size;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.Size.MEDIUM;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class ProductInCartTest extends BaseTestClass {

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
                .chooseSize(MEDIUM)
                .addToCart();
        clothes.verify()
                .successfullyAddedToShoppingCart();

        //Closing the checkoutpage
        cart.act().ContinueShopping();

        //Going to the cart
        clothes.act().proceedToCart();

        //Empty the cart
        cart.act().RemoveThingInCart();

        //Check that the cart was empty
        cart.verify().CheckThatCartIsEmpty();






        }

}
