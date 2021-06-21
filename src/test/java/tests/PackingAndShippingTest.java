package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PackingAndShipping;

public class PackingAndShippingTest extends BaseTest {

    PackingAndShipping supplies;

    @BeforeMethod
    void packagingAndShippingPage() {
        setup("chrome");
        driver.get("https://fedex.com/en-us/home.html");
        supplies = PageFactory.initElements(driver, PackingAndShipping.class);
        windowMaximize();
        deleteCookies();
    }

    @Test
    void packingAndShippingTest() {
        supplies.clickShipping();
        supplies.clickPackingAndShipping();
        supplies.createAShippingLevel();
        implicitWait(5);
        supplies.sendName();
        implicitWait(5);
        supplies.sendCompanyName();
        supplies.selectMethod();
        supplies.sendStreetAdd();
        implicitWait(5);
        supplies.sendAptAddress();
        supplies.sendZipCode();
        supplies.sendCityName();
        implicitWait(5);
        supplies.stateSelect();
        supplies.sendPhoneNo();
        supplies.sendEmail();
        implicitWait(5);
        supplies.recipientName();
        supplies.officeName();
        supplies.sendAddress1();
        supplies.sendAddress2();
        implicitWait(5);
        supplies.sendZip();
        supplies.sendCityName();
        supplies.cellPhone();
        implicitWait(5);
        supplies.sendEmailId();
        supplies.clickToBox();
        implicitWait(5);
        supplies.clickToContinue();

        String actual = supplies.covidTextMessage();
        Assert.assertEquals(actual,"Record high volumes of e-commerce orders, COVID 19 closures and weather events may cause delivery delays. Before finalizing your shipment, please confirm that your recipient can receive your package and see our latest service alert updates.");

        quitDriver();
     }

}


