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

    @When("user choose sort A-Z option")
    public void user_choose_sort_a_z_option() {

        art.act().selectSortArtFromAtoZ();

    }
    @Then("the page of art products sorted from A to Z appears")
    public void the_page_of_art_products_sorted_from_A_to_Z_appears() {

        art.verify().verifyArtDropDownAtoZ().verifySortAToZPage();

    }
    @When("user choose sort Z-A option")
    public void user_choose_sort_z_a_option() {

        art.act().selectSortArtFromZtoA();

    }
    @Then("the page of art products sorted from Z to A appears")
    public void the_page_of_art_products_sorted_from_Z_to_A_appears() {

        art.verify().verifyArtDropDownZtoA().verifySortZToAPage();

    }
    @When("user choose sort on low to high price option")
    public void user_choose_sort_on_low_to_high_price_option() {

        art.act().selectSortArtFromLowToHighPrice();
    }
    @Then("the page of art products sorted from low to high price appears")
    public void the_page_of_art_products_sorted_from_low_to_high_price_appears() {

        art.verify().verifyArtDropLowToHigh().verifySortLowToHighPricePage();

    }

    @When("user choose sort on high to low price option")
    public void user_choose_sort_on_high_to_low_price_option() {

        art.act().selectSortArtFromHighToLowPrice();

    }
    @Then("the page of art products sorted from high to low price appears")
    public void the_page_of_art_products_sorted_from_high_to_low_price_appears() {

        art.verify().verifyArtDropdownHightoLow().verifySortHighToLowPricePage();

    }
}
