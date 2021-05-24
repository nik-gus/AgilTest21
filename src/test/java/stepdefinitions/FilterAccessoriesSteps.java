package stepdefinitions;

import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;

public class FilterAccessoriesSteps {
    TopMenu top = TopMenu.getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();

    @Given(": User is on Accessorie page")
    public void userIsOnAccessoriePage() {
        top.act()
                .selectAccessories();
    }

    @When(": User chooses to filter by Home")
    public void userChoosesToFilterByHome() {
        accessories.act()
                .filterByHome();
    }

    @Then("Successs message is displayed Filter by Home Filtered")
    public void successsMessageIsDisplayedFilterByHomeFiltered() {
        accessories.verify()
        .verifyByfilterHome().verifyCategoryByHome();
    }

    @When(": User chooses to filter by Stationery")
    public void userChoosesToFilterByStationery() {
        accessories.act()
                .filterByStationery();
    }

    @Then("Successs message is displayed Filter by Stationery Filtered")
    public void successsMessageIsDisplayedFilterByStationeryFiltered() {
        accessories.verify()
                .verifyByfilterStationery().verifyCategoryByStationery();
    }

    @When(": User chooses to filter by Colour Black")
    public void userChoosesToFilterByColourBlack() {
        accessories.act()
                .filterByColourBlack();
    }

    @Then("Successs message is displayed Filter by Black Colour Filtered")
    public void successsMessageIsDisplayedFilterByBlackColourFiltered() {
        accessories.verify()
        .verifyByFilterBlackColour().verifyCategoryByColourBlack();
    }

    @When(": User chooses to filter by Colour White")
    public void userChoosesToFilterByColourWhite() {
        accessories.act()
                .filterByColourWhite();
    }

    @Then("Successs message is displayed Filter by White Colour Filtered")
    public void successsMessageIsDisplayedFilterByWhiteColourFiltered() {
        accessories.verify()
                .verifyByFilterWhiteColour().verifyCategoryByColourWhite();
    }

    @When(": User chooses to filter by Ceramic")
    public void userChoosesToFilterByCeramic() {
        accessories.act()
                .filterByCeramic();
    }

    @Then("Successs message is displayed Filter by Ceramic Option Filtered")
    public void successsMessageIsDisplayedFilterByCeramicOptionFiltered() {
        accessories.verify()
                .verifyByFilterCeramic().verifyCategoryByCeramic();
    }

    @When(": User chooses to filter by Polyester")
    public void userChoosesToFilterByPolyester() {
        accessories.act()
                .filterByPolyester();
    }

    @Then("Successs message is displayed Filter by Polyester Option Filtered")
    public void successsMessageIsDisplayedFilterByPolyesterOptionFiltered() {
        accessories.verify()
                .verifyCategoryByPolyester().verifyCategoryByPolyester();
    }

    @When(": User chooses to filter by Recycle")
    public void userChoosesToFilterByRecycle() {
        accessories.act()
                .filterByRecycle();
    }

    @Then("Successs message is displayed Filter by Recycle Option Filtered")
    public void successsMessageIsDisplayedFilterByRecycleOptionFiltered() {
        accessories.verify()
                .verifyByFilterRecycle().verifyCategoryByRecycle();
    }

    @When(": User chooses to filter by {int} pages")
    public void userChoosesToFilterByPages(int arg0) {
        accessories.act()
                .filterByProperty120Pages();
    }

    @Then("Successs message is displayed Filter by {int} Pages Option Filtered")
    public void successsMessageIsDisplayedFilterByPagesOptionFiltered(int arg0) {
        accessories.verify()
                .verifyByFilter120Pages().verifyCategoryBy120Pages();
    }

    @When(": User chooses to filter by Removable")
    public void userChoosesToFilterByRemovable() {
        accessories.act()
                .filterByPropertyRemovable();
    }

    @Then("Successs message is displayed Filter by Removable Option Filtered")
    public void successsMessageIsDisplayedFilterByRemovableOptionFiltered() {
        accessories.verify()
                .verifyByFilterRemovable().verifyCategoryByRemovable();
    }

    @When(": User chooses to filter by Graphic")
    public void userChoosesToFilterByGraphic() {
        accessories.act()
                .filterByPropertyByBrandGraphic();
    }

    @Then("Successs message is displayed Filter by Graphic Brand Option Filtered")
    public void successsMessageIsDisplayedFilterByGraphicBrandOptionFiltered() {
        accessories.verify()
                .verifyByFilterBrandGraphic().verifyCategoryByBrandGraphic();
    }

    @When(": User chooses to filter by Studio")
    public void userChoosesToFilterByStudio() {
        accessories.act()
                .filterByPropertyByBrandStudio();
    }

    @Then("Successs message is displayed Filter by Studio Brand Option Filtered")
    public void successsMessageIsDisplayedFilterByStudioBrandOptionFiltered() {
        accessories.verify()
                .verifyByFilterBrandStudio().verifyCategoryByBrandStudio();
    }

}
