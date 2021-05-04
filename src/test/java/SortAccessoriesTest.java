import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class SortAccessoriesTest extends BaseTestClass{
    TopMenu top = getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by price low to high")

    void testSortAccessoriesLowToHigh() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .clickRelevenceButton()
                .clickLowToHigh();
        accessories.verify()
                .verifyLowToHigh();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by price high to low")
    void testSortAccessoriesHighToLow() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .clickRelevenceButton()
                .clickHighToLow();
        accessories.verify()
                .verifyHighToLow();
    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by name A to Z")
    void testSortAccessoriesNameATOZ() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .clickRelevenceButton()
                .clickNameAToZ();
        accessories.verify()
                .verifyATOZ();



    }

    @Test
    @Description("As a User i would like to test Sort option, so that accessories are sorted by name Z to A")
    void testSortAccessoriesNameZTOA() {
        top.act()
                .selectAccessories()
                .andThen()
                .verifyAccessoriesPage("Accessories");
        accessories.act()
                .clickRelevenceButton()
                .clickNameZToA();
        accessories.verify()
                .verifyZTOA();
    }

}
