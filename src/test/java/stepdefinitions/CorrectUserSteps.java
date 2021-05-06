package stepdefinitions;

import com.prestashop.pages.authentication.AuthPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class CorrectUserSteps {

    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = TopMenu.getTopMenu();
    AuthPage authPage = AuthPage.getAuthPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @After
    public void cleanUp() {
        driver.get("http://40.76.27.113:8085/en/?mylogout=");
    }

    @Given("User is on homepage")
    public void UserHomePage() {
        top.act()
                .selectSignInButton();

    }

    @When("User input valid information")
    public void CreateUser() {
        authPage.act()
                .selectCreateAccountLink()
                .selectSocialTitleMrs()
                .enterFirstName("Kalle")
                .enterLastName("Andersson")
                .enterRandomizedEmail()
                .enterPassword("Password123")
                .enterBirthday("03/02/1995")
                .selectReceiveOffers()
                .subscribeToNewsletter()
                .agreeToTerms()
                .saveAccount();
    }

    @Then("User should be logged in")
    public void UserLoggedIn() {
        top.verify()
                .userLoggedIn("Kalle Andersson");
    }

}
