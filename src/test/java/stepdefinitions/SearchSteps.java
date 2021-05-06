package stepdefinitions;

import com.prestashop.pages.search.SearchPage;
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

public class SearchSteps {
    public static WebDriver driver;
    public static WebDriverWait wait;

    SearchPage search = SearchPage.getSearchPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }

    @When("^user search (.*)$")
    public void UserSearchItem(String item){
        search.act()
                .typeSearch(item)
                .clickSearch();
    }

    @Then("^(.*) will be searched$")
    public void ItemIsSearched(String item){
        search.verify()
                .verifyItem(item);
    }
}
