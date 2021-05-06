package stepdefinitions;

import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class SortAccessoriesSteps {

    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = TopMenu.getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @Given(": User is on Accessories page")
    public void user_is_on_accessories_page() {
        top.act()
                .selectAccessories()
                    .andThen()
                .verifyPageTitle("Accessories");
    }

    @When(": User chooses to sort products by A To Z")
    public void user_chooses_to_sort_products_by_a_to_z() {
        accessories.act()
                .clickRelevenceButton()
                .clickNameAToZ();
    }

    @Then("Success message is displayed When A TO Z is verified")
    public void successMessageIsDisplayedWhenATOZIsVerified() {
        accessories.verify()
                .verifyATOZ();
    }

    @When(": User chooses to sort products by Z To A")
    public void userChoosesToSortProductsByZToA() {
        accessories.act()
                .clickRelevenceButton()
                .clickNameZToA();
    }

    @Then("Success message is displayed When Z TO A is verified")
    public void successMessageIsDisplayedWhenZTOAIsVerified() {
        accessories.verify()
                .verifyZTOA();
    }

    @When(": User chooses to sort products by Low To High")
    public void userChoosesToSortProductsByLowToHigh() {
        accessories.act()
                .clickRelevenceButton()
                .clickLowToHigh();
    }

    @When(": User chooses to sort products by High To Low")
    public void userChoosesToSortProductsByHighToLow() {
        accessories.act()
                .clickRelevenceButton()
                .clickHighToLow();
    }

    @Then("Success message is displayed When Low To High is verified")
    public void successMessageIsDisplayedWhenLowToHighIsVerified() {
        accessories.verify()
                .verifyLowToHigh();
    }

    @Then("Success message is displayed When High To Low is verified")
    public void successMessageIsDisplayedWhenHighToLowIsVerified() {
        accessories.verify()
                .verifyHighToLow();
    }

}
