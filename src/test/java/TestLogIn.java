
import com.prestashop.pages.authentication.AuthActController;
import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.top.TopMenu.getTopMenu;


public class TestLogIn extends BaseTestClass {
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
                .userLoggedIn("tolvan tolvansson");
    }


}

