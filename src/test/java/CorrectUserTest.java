import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

class CorrectUserTest extends BaseTestClass {
    TopMenu top = TopMenu.getTopMenu();
    AuthPage authPage = AuthPage.getAuthPage();

    @Test
    void testFillAllFieldsInTheForm() {
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

    @Test
    void testLeaveAllOptionalFieldsEmpty(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Test")
                .enterLastName("Testsson")
                .enterRandomizedEmail()
                .enterPassword("Password1")
                .enterBirthday("")
                .agreeToTerms()
                .saveAccount();
        top.verify()
                .userLoggedIn("Test Testsson");
    }

}

