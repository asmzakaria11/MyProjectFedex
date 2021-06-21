package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ShippingPage;

public class ShippingPageTest extends BaseTest {

    ShippingPage shipping;

    @BeforeMethod
    void fedExShipping() {
        setup("chrome");
        driver.get("https://www.fedex.com/en-us/home.html");
        shipping = PageFactory.initElements(driver, ShippingPage.class);
        windowMaximize();
        deleteCookies();
    }

    @Test
    void homePageShippingTest() {
        shipping.clickShipping();
        shipping.createAShipment();
        shipping.sendUserId();
        shipping.sendPassWord();
        shipping.logIn();

        quitDriver();
}
}

