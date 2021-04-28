package stepdefinitions;

import com.prestashop.pages.art.ArtPage;
import com.prestashop.pages.top.TopMenu;
import com.prestashop.utils.CommonVerification;
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
    CommonVerification common = CommonVerification.getCommonVerification();

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

    @When("^user filters product by (.*)$")
    public void userFiltersProductByFilter(String filter) {
        art.act()
                .selectFilter(filter);
    }

    @Then("^products will be filtered by (.*)$")
    public void productsWillBeFilteredByFilter(String filter) {
        art.verify()
                .urlContains(filter)
                .filterIsActive(filter);

    }
}
