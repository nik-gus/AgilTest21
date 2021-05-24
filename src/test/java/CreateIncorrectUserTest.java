import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.getAuthPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class CreateIncorrectUserTest extends BaseTestClass{
    TopMenu top = getTopMenu();
    AuthPage authPage = getAuthPage();

    @Test
    void testEmptyField(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Månsson")
                .enterEmail("")
                .enterPassword("")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .emptyFieldFailed();
    }

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
    void testMissingAtSignInEmail() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1gmail.com")
                .enterPassword("tolvan1@")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .missingAtEmail();
    }

    @Test
    void testMissingTextAfterAtSignInEmail() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@")
                .enterPassword("tolvan1")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .missingAfterAtEmail();
    }

    @Test
    void testMissingDotInEmail() {
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@test")
                .enterPassword("tolvan1")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .missingDotEmail();
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
                .enterPassword("tol@")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .shortPasswordFailed();
    }

    @Test
    void testWrongBirthday(){
        top.act()
                .selectSignInButton();
        authPage.act()
                .selectCreateAccountLink()
                .enterFirstName("Tove")
                .enterLastName("Larsson")
                .enterEmail("tolvan1@mailt.com")
                .enterPassword("tolv@")
                .enterBirthday("1997/11/04")
                .agreeToTerms()
                .saveAccount();
        authPage.verify()
                .wrongBirthdayFailed();
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
