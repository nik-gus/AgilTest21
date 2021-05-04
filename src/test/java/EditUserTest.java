import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.pages.user.UserPage;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.pages.user.UserPage.getUserPage;

class EditUserTest extends BaseTestClass{

    TopMenu top = getTopMenu();
    AuthPage auth = getAuthPage();
    UserPage user = getUserPage();

    @Test
    void changeUserAddress1() {
        top.act()
                .selectSignInButton();
        auth.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn();
        user.act()
                .clickOnAddressesLink()
                .clickOnUpdateLink()
                .changeAddress1("Testgatan 12")
                .clickOnSaveButton();
        user.verify()
                .addressUpdated();
    }

}
