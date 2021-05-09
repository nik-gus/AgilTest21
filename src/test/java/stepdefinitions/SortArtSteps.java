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

public class SortArtSteps {
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

    @Given("user is on page for art products")
    public void user_is_on_page_for_art_products() {
        top.act().selectArt();
    }

    @When("^user choose sort by (.*)$")
    public void userChooseSortBySortBy(String sortBy) {
        art.act()
                .clickSortByDropDown()
                .selectSortArtBy(sortBy);
    }

    @Then("^the products on art page is sorted by (.*)$")
    public void theProductsOnArtPageIsSortedBy(String sortBy) {
        art.verify()
                .artProductsIsSortedBy(sortBy)
                .urlContainsSortOrder(sortBy);
    }

}
