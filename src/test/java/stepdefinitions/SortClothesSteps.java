package stepdefinitions;

import com.prestashop.pages.art.ArtPage;
import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.art.ArtPage.getArtPage;
import static com.prestashop.pages.clothes.ClothesPage.getClothesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;
import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class SortClothesSteps {
    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = getTopMenu();
    ArtPage art = getArtPage();
    ClothesPage clothes = getClothesPage();

    @Before
    public void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.get("http://40.76.27.113:8085/en/");
    }


    @Given("user is on page for clothes")
    public void user_is_on_page_for_clothes() {
        top.act().selectClothes();


    }

    @When("user choose sort A-Z option for clothes")
    public void user_choose_sort_a_z_option_for_clothes() {

        clothes.act()
                .clickRelevenceButton()
                .clickNameAToZ();

    }

    @Then("the page of clothes sorted from A to Z appears")
    public void the_page_of_clothes_sorted_from_a_to_z_appears() {

        clothes.verify().verifyAllClothesATOZ();

    }

    @When("user choose sort Z-A option for clothes")
    public void user_choose_sort_z_a_option_for_clothes() {

        clothes.act().clickRelevenceButton().clickNameZToA();

    }

    @Then("the page of clothes sorted from Z to A appears")
    public void the_page_of_clothes_sorted_from_z_to_a_appears() {

        clothes.verify().verifyAllClothesZTOA();


    }

    @When("user choose sort on low to high price option for clothes")
    public void user_choose_sort_on_low_to_high_price_option_for_clothes() {

        clothes.act().clickRelevenceButton().clickLowToHigh();

    }
    @Then("the page of clothes sorted from low to high price appears")
    public void the_page_of_clothes_sorted_from_low_to_high_price_appears() {

        clothes.verify().verifyAllClothesLowToHigh();

    }

    @When("user choose sort on high to low price option for clothes")
    public void user_choose_sort_on_high_to_low_price_option_for_clothes() {
        clothes.act().clickRelevenceButton().clickHighToLow();

    }
    @Then("the page of clothes sorted from high to low price appears")
    public void the_page_of_clothes_sorted_from_high_to_low_price_appears() {

        clothes.verify().verifyAllClothesHighToLow();

    }

}
