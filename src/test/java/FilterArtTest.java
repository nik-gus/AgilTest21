import com.prestashop.pages.art.ArtPage;
import com.prestashop.pages.top.TopMenu;
import org.junit.jupiter.api.Test;

import static com.prestashop.pages.art.ArtPage.getArtPage;
import static com.prestashop.pages.top.TopMenu.getTopMenu;

class FilterArtTest extends BaseTestClass{

    TopMenu top = getTopMenu();
    ArtPage art = getArtPage();

    @Test
    void testFilterByComposition()  {
        top.act()
                .selectArt();
        art.act()
                .selectMattPaper()
                    .andThen()
                .verifyUrlFraction("Composition-Matt+paper");
        //TODO: assert active filter element
    }


}
