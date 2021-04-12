import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.prestashop.utils.DriverFactory.getDriver;
import static com.prestashop.utils.DriverFactory.getWebDriverWait;

public class BaseTestClass {
    static WebDriver driver;
    static WebDriverWait wait;

    @Before
    public static void setup() {
        driver = getDriver();
        wait = getWebDriverWait();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://40.76.27.113:8085/en/");


    }

//    @BeforeEach
//    public void goHome() {
//        driver.get("http://localhost:8001");
//    }

//    @After
//    public static void tearDown() {
//        driver.quit();
//    }

}
