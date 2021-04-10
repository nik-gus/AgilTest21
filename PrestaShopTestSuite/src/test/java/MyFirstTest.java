import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class MyFirstTest  {

TopMenu top = getTopMenu();
AuthPage authPage = AuthPage.getAuthPage();

WebDriver driver;
WebDriverWait wait;

private void setup() {
    driver = getDriver();
    wait = getWebDriverWait();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8001");
}

    @Test
    void createAccount() {
        setup();
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
                .submit();
        top.verify()
                .userLoggedIn("Tolvan Tolvansson");





    }

}
