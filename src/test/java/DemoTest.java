import com.prestashop.pages.clothes.ClothesPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

 class DemoTest extends BaseTestClass{

    TopMenu top = TopMenu.getTopMenu();
    ClothesPage clothes = ClothesPage.getClothesPage();

    @Disabled("For demo purpose only")
    @Test
    void testFilterBlaBla() {
        top.act()
                .selectClothes();
        clothes.act()
                .selectMen()
                .filterSize("M")
                .filterSize("L")
                .filterSize("XL")
                .filterSize("S");
    }

}
