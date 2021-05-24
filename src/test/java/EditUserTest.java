import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.pages.account.AccountPage;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.authentication.AuthPage.*;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.pages.account.AccountPage.getUserPage;
import static com.prestashop.utils.TestDataGenerator.*;

class EditUserTest extends BaseTestClass{

    TopMenu top = getTopMenu();
    AuthPage auth = getAuthPage();
    AccountPage account = getUserPage();

    @Test
    void changeUserAddress1() {
        top.act()
                .selectSignInButton();
        auth.act()
                .enterEmail(TEST_USER_EMAIL)
                .enterPassword(TEST_USER_PASSWORD)
                .signIn();
        account.act()
                .clickOnAddressesLink()
                .clickOnUpdateLink()
                .changeAddress1(generateAddress())
                .clickOnSaveButton();
        account.verify()
                .addressUpdated();
    }

}
