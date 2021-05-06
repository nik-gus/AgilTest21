import com.prestashop.pages.accessories.AccessoriesPage;
import com.prestashop.pages.top.TopMenu;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.accessories.AccessoriesPage.getAccessoriesPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class FilterAccessoriesTest extends BaseTestClass{
    TopMenu top = getTopMenu();
    AccessoriesPage accessories = getAccessoriesPage();

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by Category Home")
    void clickOnFilterHome(){

        top.act()
                .selectAccessories();
        accessories.act()
                .filterByHome();
        accessories.verify()
                .verifyCategoryByHome();
    }

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by Category Stationery")

    void clickOnFilterStationery(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByStationery();
        accessories.verify()
                .verifyCategoryByStationery();
    }


    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by Colour white ")
    void clickOnFilterByWhiteColour(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByColourWhite();
        accessories.verify()
                .verifyCategoryByColourWhite();
    }

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by Colour black ")
    void clickOnFilterByBlackColour(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByColourBlack();
        accessories.verify()
                .verifyCategoryByColourBlack();
    }
    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by composition ceramic ")
    void clickOnFilterByCeramic(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByCeramic();
        accessories.verify()
                .verifyCategoryByCeramic();
    }
    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by composition polyester ")
    void clickOnFilterByPolyester(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByPolyester();
        accessories.verify()
                .verifyCategoryByPolyester();

    }

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by composition Recycle ")
    void clickOnFilterByRecycle(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByRecycle();
        accessories.verify()
                .verifyCategoryByRecycle();

    }

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by property 120 pages ")
    void clickOnFilterBy120Pages(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByProperty120Pages();
        accessories.verify()
                .verifyCategoryBy120Pages();

    }


    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by property Removable")
    void clickOnFilterRemovable(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByPropertyRemovable();
        accessories.verify()
                .verifyCategoryByRemovable();

    }


    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by brand graphic")
    void clickOnFilterBrandGraphic(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByPropertyByBrandGraphic();
        accessories.verify()
                .verifyCategoryByBrandGraphic();

    }

    @Test
    @Description("As a User i would like to test Filter option in Accessories, so that I can filter Accessories by brand studio")
    void clickOnFilterBrandStudio(){
        top.act()
                .selectAccessories();
        accessories.act()
                .filterByPropertyByBrandStudio();
        accessories.verify()
                .verifyCategoryByBrandStudio();

    }



}
