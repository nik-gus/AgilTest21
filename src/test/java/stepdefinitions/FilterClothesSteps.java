package stepdefinitions;

import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class FilterClothesSteps {
    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = getTopMenu();
    ClothesPage clothes = getClothesPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @Given("^user is on Clothes page")
    public void userIsOnClothesPage() {
        top.act()
                .selectClothes();
    }

    @When("^user filter by Men")
    public void userFilterByCategoryMen(){
        clothes.act()
                .selectMen();
    }

    @When("^user filter by sizes M and L")
    public void userFilterBySizes() {
        clothes.act()
                .filterSize("M")
                .filterSize("L");
    }

    @Then("^products displayed are filtered by all three filter options")
    public void productsDisplayedAreFilteredByMenAndSizes() {
    clothes.verify()
            .verifyProductsAreFilteredBySizesForMen();
    }

    @When("user filter by category Men")
    public void user_filter_by_category_men() {
        clothes.act()
                .selectMen();
    }

    @Then("products displayed are filtered by men")
    public void products_displayed_are_filtered_by_men() {
        clothes.verify()
                .verifyMen();
    }

    @When("user filter by category woman")
    public void user_filter_by_category_woman() {
        clothes.act()
                .selectWomen();
    }
    @Then("products displayed are filtered by woman")
    public void products_displayed_are_filtered_by_woman() {
        clothes.verify()
                .verifyWomen();
    }

}
