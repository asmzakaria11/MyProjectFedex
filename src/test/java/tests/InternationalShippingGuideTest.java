package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InternationalShippingGuide;

public class InternationalShippingGuideTest extends BaseTest {

    InternationalShippingGuide international;

    @BeforeMethod
    void internationalShippingGuide(){
        setup("chrome");
        driver.get("https://fedex.com/en-us/home.html");
        international = PageFactory.initElements(driver,InternationalShippingGuide.class);
        windowMaximize();
        deleteCookies();
    }
    @Test
    void shippingGuideTest(){
        international.clickShipping();
        international.internationalShippingGuide();
        implicitWait(5);
        international.howToShipInternationally();
        implicitWait(5);
        international.clickStep1();
        implicitWait(5);
        international.clickStep2();
        implicitWait(5);
        international.clickStep3();
        implicitWait(5);
        international.clickStep4();
        implicitWait(6);
        international.clickStep5();
        international.clickStep6();
        international.clickStep7();
        international.clickStep8();

        quitDriver();
    }
}
