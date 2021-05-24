package stepdefinitions;

import com.prestashop.pages.sort.SortPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class SortProductsSteps {
    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = getTopMenu();
    SortPage sort = SortPage.getSortPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @Given("^user is on page (.*)$")
    public void userIsOnPage(String page) {
        top.act()
                .navigateToPage(page);
    }

    @When("^user choose sort by (.*)$")
    public void userChooseSortBySortBy(String sortBy) {
        sort.act()
                .clickSortByDropDown()
                .selectSortArtBy(sortBy);
    }

    @Then("^the products is sorted by (.*)$")
    public void theProductsIsSortedBy(String sortBy) {
        sort.verify()
                .dropDownListDisplaysCurrentSortOrder(sortBy)
                .urlContainsSortOrder(sortBy)
                .productsIsSortedBy(sortBy);
    }

}
