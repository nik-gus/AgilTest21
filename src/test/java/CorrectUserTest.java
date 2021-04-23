import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

public class CorrectUserTest extends BaseTestClass {
    TopMenu top = TopMenu.getTopMenu();
    AuthPage authPage = AuthPage.getAuthPage();

    @Test
    void testCreateCorrectUser() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .selectSocialTitleMrs()
                .enterFirstName("Test")
                .enterLastName("Tester")
                .enterRandomizedEmail()
                .enterPassword("Password1")
                .enterBirthday("01/01/1956")
                .selectReceiveOffers()
                .subscribeToNewsletter()
                .agreeToTerms()
                .saveAccount();
        top.verify()
                .userLoggedIn("Test Tester");
    }



    }

