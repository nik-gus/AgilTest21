package stepdefinitions;

import com.prestashop.pages.art.ArtPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.getArtPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class FilterArtSteps {
    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = getTopMenu();
    ArtPage art = getArtPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @Given("page Art is open")
    public void userIsOnArtPage() {
        top.act()
                .selectArt();
    }

    @When("^user filters products by a single filter (.*)$")
    public void userFiltersProductsByASingleFilter(String filter) {
        art.act()
                .selectFilter(filter);
    }

    @Then("^products displayed is filtered by a single filter (.*)$")
    public void productsDisplayedIsFilteredByASingleFilter(String filter) {
        art.verify()
                .urlContains(filter)
                .filterIsActive(filter);
    }

    @When("user combines the two filters (.*) and (.*)$")
    public void userCombinesTheTwoFiltersFilter1AndFilter2(String filter1, String filter2) {
        art.act()
                .selectFilter(filter1)
                .selectFilter(filter2);
    }

    @Then("^displayed products is filtered by (.*) and (.*)$")
    public void displayedProductsIsFilteredByFilter1AndFilter2(String filter1, String filter2) {
        art.verify()
                .urlContains(filter1)
                .urlContains(filter2)
                .filterIsActive(filter1)
                .filterIsActive(filter2);
    }

}
