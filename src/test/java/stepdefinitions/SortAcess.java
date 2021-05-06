package stepdefinitions;

import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.After;
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

public class SortAcess {


    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = TopMenu.getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();

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
        accessories.verify()
                .verifyATOZ();
    }
    @Then("Success message is displayed")
    public void success_message_is_displayed() {
        System.out.println("Sorted is successfull");

    }

    @When(": User chooses to sort products by Z To A")
    public void userChoosesToSortProductsByZToA() {
        accessories.act()
                .clickRelevenceButton()
                .clickNameZToA();
        accessories.verify()
                .verifyZTOA();
    }


    @When(": User chooses to sort products by Low To High")
    public void userChoosesToSortProductsByLowToHigh() {
        accessories.act()
                .clickRelevenceButton()
                .clickLowToHigh();
        accessories.verify()
                .verifyLowToHigh();
    }

    @When(": User chooses to sort products by High To Low")
    public void userChoosesToSortProductsByHighToLow() {
        accessories.act()
                .clickRelevenceButton()
                .clickHighToLow();
        accessories.verify()
                .verifyHighToLow();
    }
}
