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
                .verifyPageTitle("Login");
        authPage.act()
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolvan1")
                .signIn();
        top.verify()
                .userLoggedIn("tttttolvan tolvansson");
    }

}