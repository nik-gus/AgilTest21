import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.pages.user.UserPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.clothes.Size.MEDIUM;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.pages.user.UserPage.getUserPage;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DemoTest extends BaseTestClass {



//        clickOnSignInLink();
//        email(Constant_MF.TEST_USER_EMAIL_1);
//        password(Constant_MF.TEST_USER_PASSWORD_1);
//        submitButton();
//        clickOnAddressesLink();
//        clickOnUpdateLink();
//        changeAddress1("Testgatan 12");
//        clickOnSaveButton();
//
//        assertEquals("Address successfully updated!", driver.findElement(By.cssSelector("#notifications > div > article")).getText());
//        //createANewAddress();

    }
/*
TopMenu top = getTopMenu();
AuthPage authPage = getAuthPage();
OrderPage order = getOrderPage();
ClothesPage clothes = getClothesPage();
CartPage cart = getCartPage();

    @Test
    void testCreateAccount() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tolvan")
                .enterLastName("Tolvansson")
                .selectSocialTitleMr()
                .enterRandomizedEmail()
                .enterPassword("password")
                .agreeToTerms()
                .saveAccount();
        top.verify()
                .userLoggedIn("Tolvan Tolvansson");
    }

    @Test
    void testSignInWithValidCredentials() {
        top.act()
                .selectSignInButton()
                    .andThen()
                .verifyPageTitle("Login");
        authPage.act()
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolvan1")
                .signIn();
        top.verify()
                .userLoggedIn("tolvan tolvansson");
    }

    @Test
    void testSignInWithNoExistingAccount() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .enterRandomizedEmail()
                .enterPassword("2343e423")
                .signIn();
        authPage.verify()
                .authenticationFailed();
    }

    @Disabled
    @Test
    void testPlaceOrder() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn();
        top.act()
                .selectClothes();
        clothes.act()
                .selectFirstArticleOfClothing()
                .addToCart()
                .proceedToCart();
        cart.act()
                .proceedToCheckout();
        order.act()
                //.enterAddress("testadress")
                //.enterPostalCode("123 45")
                //.enterCity("sthlm")
                .continueToShipping()
                .continueToPayment()
                .payByBankWire()
                .agreeToTermsAndConditions()
                .placeOrder();
        order.verify()
                .orderConfirmed();
    }

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
    }*/
//} // end class
