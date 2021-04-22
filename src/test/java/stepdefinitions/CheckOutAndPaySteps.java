package stepdefinitions;

import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.clothes.Size;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.utils.Color;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.cart.CartPage.PAGE_TITLE_CART;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.clothes.ClothesPage.*;
import static com.prestashop.pages.order.OrderPage.URL_PATH_ORDER;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class CheckOutAndPaySteps {

    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();

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

    @Given("Guest user is on order page")
    public void guestUserIsOnOrderPage() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectFirstArticleOfClothing()
                .addToCart()
                .proceedToCart();
        cart.act()
                .proceedToCheckout()
                    .andThen()
                .verifyUrlPath(URL_PATH_ORDER);
    }

    @When("User inputs invalid email address")
    public void userInputsInvalidEmailAddress() {
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
    }
}
