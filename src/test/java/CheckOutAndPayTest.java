import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.clothes.Size;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.utils.Color;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.cart.CartPage.PAGE_TITLE_CART;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.*;
import static com.prestashop.pages.clothes.Size.EXTRA_LARGE;
import static com.prestashop.pages.clothes.Size.LARGE;
import static com.prestashop.pages.order.OrderPage.*;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.TestDataGenerator.*;

class CheckOutAndPayTest extends BaseTestClass {

    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();
    AuthPage authPage = getAuthPage();

    @Test
    void testBuyAsGuest() {
        top.act()
                .selectClothes()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectArticleOfClothingByName(HUMMINGBIRD_PRINTED_T_SHIRT)
                .chooseSize(Size.MEDIUM)
                .chooseColor(Color.BLACK)
                .addToCart();
        clothes.verify()
                .successfullyAddedToShoppingCart();
        clothes.act()
                .proceedToCart()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_CART);
        cart.act()
                .proceedToCheckout()
                    .andThen()
                .verifyUrlPath(URL_PATH_ORDER);
        order.act()
                .selectSocialTitleMrs()
                .enterFirstName(generateFirstName())
                .enterLastName(generateLastName())
                .enterRandomizedEmail()
                .agreeToTermsAndConditions()
                .continueToAdresses()
                .enterAddress(generateAddress())
                .enterPostalCode("123 45") //TODO: hard coded...
                .enterCity(generateCity())
                .continueToShipping()
                //default shipping
                .continueToPayment()
                .payByBankWire()
                .agreeToTermsOfService()
                .placeOrder()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_ORDER_CONFIRMATION);
        order.verify()
                .orderConfirmed();
    }

    @Test
    void testBuyAsRegisteredUserNotLoggedIn() {
        top.act()
                .selectClothes()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_CLOTHES);
        clothes.act()
                .selectArticleOfClothingByName(HUMMINGBIRD_PRINTED_SWEATER)
                .chooseSize(LARGE)
                .addToCart();
        clothes.verify()
                .successfullyAddedToShoppingCart();
        clothes.act()
                .proceedToCart()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_CART);
        cart.act()
                .proceedToCheckout()
                    .andThen()
                .verifyUrlPath(URL_PATH_ORDER);
        order.act()
                .selctSignIn()
                .enterEmailSignIn(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn()
                .confirmAddress()
                .continueToPayment()
                .payByCheck()
                .agreeToTermsOfService()
                .placeOrder();
        order.verify()
                .orderConfirmed();
    }

    @Test
    void testBuyAsRegisteredUserLoggedIn() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn();
        top.act()
                .selectClothes();
        clothes.act()
                .selectArticleOfClothingByName(HUMMINGBIRD_PRINTED_SWEATER)
                .chooseSize(EXTRA_LARGE)
                .addToCart()
                .proceedToCart();
        cart.act()
                .proceedToCheckout();
        order.act()
                .confirmAddress()
                .continueToPayment()
                .payByBankWire()
                .agreeToTermsOfService()
                .placeOrder();
        order.verify()
                .orderConfirmed();
    }

}
