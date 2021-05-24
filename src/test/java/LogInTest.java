import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class LogInTest extends BaseTestClass {
    TopMenu top = getTopMenu();
    AuthPage authPage = getAuthPage();

    @Test
    void testLogIn() {
        top.act()
                .selectSignInButton()
                    .andThen()
                .verifyPageTitle(PAGE_TITLE_LOGIN);
        authPage.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn();
        top.verify()
                .userLoggedIn("Tolvan Tolvansson");
    }

    @Test
    void testFailedLoginIncorrectPassword() {
        top.act()
                .selectSignInButton()
                .andThen()
                .verifyPageTitle(PAGE_TITLE_LOGIN);
        authPage.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword("ttolvan")
                .signIn();
        authPage.verify()
                .authenticationFailed();
    }

}