import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.getAuthPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;


class DemoTest extends BaseTestClass {

TopMenu top = getTopMenu();
AuthPage authPage = getAuthPage();
OrderPage order = getOrderPage();

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
                .save();
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



}
