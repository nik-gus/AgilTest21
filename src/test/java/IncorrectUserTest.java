import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static com.prestashop.pages.authentication.AuthPage.getAuthPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

public class IncorrectUserTest extends BaseTestClass{
    TopMenu top = getTopMenu();
    AuthPage authPage = getAuthPage();

    @Test
    void testEmailExist(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolvan1")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .emailExistFailed();
    }

    @Test
    void testIncorrectEmail() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1")
                .enterPassword("tolvan1")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .missingAtEmail();
    }

    @Test
    void testShortPassword(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolv")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .shortPasswordFailed();
    }

    @Test
    void testNotAgree(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@mail.com")
                .enterPassword("tolv1")
                .saveAccount();
        authPage.verify()
                .notAgreeFailed();
    }
}
