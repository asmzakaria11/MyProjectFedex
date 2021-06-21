package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RatesAndDeliveryTimes;

public class RatesAndDeliveryTimesTest extends BaseTest{

    RatesAndDeliveryTimes deliveryTimes;

    @BeforeMethod
    void ratesAndDeliveryTimes(){
        setup("chrome");
        driver.get("https://www.fedex.com/en-us/home.html");
        deliveryTimes = PageFactory.initElements(driver,RatesAndDeliveryTimes.class);
        windowMaximize();
        deleteCookies();
    }

    @Test
    void ratesAndDeliveryTest(){
        deliveryTimes.clickShipping();
        implicitWait(5);
        deliveryTimes.shippingRates();
        implicitWait(5);
        deliveryTimes.ratesLbs();
        implicitWait(5);
        deliveryTimes.rateTools();
        implicitWait(5);
        deliveryTimes.fedexRateSheet();
        implicitWait(1);
        deliveryTimes.getStandardRate();
        implicitWait(5);
        deliveryTimes.clickMoreInformation();

       quitDriver();
    }
    }


