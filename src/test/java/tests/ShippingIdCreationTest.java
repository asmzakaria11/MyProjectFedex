package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ShippingIdCreation;

public class ShippingIdCreationTest extends BaseTest {

    ShippingIdCreation shippingIdCreation;

    @BeforeMethod

    void idCreation(){
        setup("chrome");
        driver.get("https://www.fedex.com/en-us/home.html");
        shippingIdCreation = PageFactory.initElements(driver,ShippingIdCreation.class);
        windowMaximize();
        deleteCookies();

    }
    @Test
    void shippingIdCreation(){
        shippingIdCreation.clickShipping();
        implicitWait(5);
        shippingIdCreation.clickByShipment();
        implicitWait(5);
        shippingIdCreation.clickOnThelink();
        implicitWait(5);
        shippingIdCreation.sendFirstName();
        shippingIdCreation.sendInitial();
        shippingIdCreation.sendLastName();
        shippingIdCreation.sendEmailId();
        shippingIdCreation.reSendEmailId();
        shippingIdCreation.sendAddress1();
        shippingIdCreation.sendAddress2();
        shippingIdCreation.sendCity();
        shippingIdCreation.selectMethod();
        shippingIdCreation.sendZipCode();
        shippingIdCreation.sendPhoneNo();
        shippingIdCreation.sendUserId();
        shippingIdCreation.sendPassword();
        shippingIdCreation.sendRePassword();
        shippingIdCreation.selectQuestionMethod();
        shippingIdCreation.sendAnswer();
        shippingIdCreation.clickToTheBox();
        shippingIdCreation.clickOnContinue();

        quitDriver();

    }
}
