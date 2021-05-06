package stepdefinitions;

import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.cart.CartPage;
import com.prestashop.pages.order.OrderPage;
import com.prestashop.pages.top.TopMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.cart.CartPage.getCartPage;
import static com.prestashop.pages.order.OrderPage.getOrderPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

public class FilterArtByCategory {
    public static WebDriver driver;
    public static WebDriverWait wait;

    TopMenu top = TopMenu.getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();
    CartPage cart = getCartPage();
    OrderPage order = getOrderPage();

    @Given(": User is on Accessorie page")
    public void userIsOnAccessoriePage() {
        top.act()
                .selectAccessories();

    }

    @When(": User chooses to filter by Home")
    public void userChoosesToFilterByHome() {
        accessories.act()
                .filterByHome();
        accessories.verify()
                .verifyCategoryByHome();
    }

    @Then("Successs message is displayed")
    public void successsMessageIsDisplayed() {
        System.out.println("Sorted is successfull");

    }

    @When(": User chooses to filter by Stationery")
    public void userChoosesToFilterByStationery() {
        accessories.act()
                .filterByStationery();
        accessories.verify()
                .verifyCategoryByStationery();
    }

    @When(": User chooses to filter by Colour Black")
    public void userChoosesToFilterByColourBlack() {
        accessories.act()
                .filterByColourBlack();
        accessories.verify()
                .verifyCategoryByColourBlack();
    }

    @When(": User chooses to filter by Colour White")
    public void userChoosesToFilterByColourWhite() {
        accessories.act()
                .filterByColourWhite();
        accessories.verify()
                .verifyCategoryByColourWhite();
    }

    @When(": User chooses to filter by Ceramic")
    public void userChoosesToFilterByCeramic() {
        accessories.act()
                .filterByCeramic();
        accessories.verify()
                .verifyCategoryByCeramic();
    }

    @When(": User chooses to filter by Polyester")
    public void userChoosesToFilterByPolyester() {
        accessories.act()
                .filterByPolyester();
        accessories.verify()
                .verifyCategoryByPolyester();
    }

    @When(": User chooses to filter by Recycle")
    public void userChoosesToFilterByRecycle() {
        accessories.act()
                .filterByRecycle();
        accessories.verify()
                .verifyCategoryByRecycle();
    }

    @When(": User chooses to filter by {int} pages")
    public void userChoosesToFilterByPages(int arg0) {
        accessories.act()
                .filterByProperty120Pages();
        accessories.verify()
                .verifyCategoryBy120Pages();
    }

    @When(": User chooses to filter by Removable")
    public void userChoosesToFilterByRemovable() {
        accessories.act()
                .filterByPropertyRemovable();
        accessories.verify()
                .verifyCategoryByRemovable();
    }

    @When(": User chooses to filter by Graphic")
    public void userChoosesToFilterByGraphic() {
        accessories.act()
                .filterByPropertyByBrandGraphic();
        accessories.verify()
                .verifyCategoryByBrandGraphic();
    }

    @When(": User chooses to filter by Studio")
    public void userChoosesToFilterByStudio() {
        accessories.act()
                .filterByPropertyByBrandStudio();
        accessories.verify()
                .verifyCategoryByBrandStudio();
    }
}
