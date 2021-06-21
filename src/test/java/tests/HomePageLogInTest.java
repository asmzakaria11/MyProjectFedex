package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageLogIn;

public class HomePageLogInTest extends BaseTest {

    HomePageLogIn homePage;

    @BeforeMethod
     void chromeDriver() {
     setup("chrome");
     driver.get("https://www.fedex.com/en-us/home.html");
     homePage= PageFactory.initElements(driver, HomePageLogIn.class);
     windowMaximize();
    }


    @Test
    void homePageLogInTest(){
        homePage.setClickByWareHouse();
        implicitWait(5);
        homePage.sendUserLogIn();
        implicitWait(5);
        homePage.sendPassword();
        implicitWait(5);
        homePage.clickLogIn();
        implicitWait(5);
        homePage.copyWrongTextMsg();

        String actualText = homePage.copyWrongTextMsg();
        Assert.assertEquals(actualText,"Sorry. Something went wrong. Please re-enter your user name and password to try again.");

        quitDriver();

        }
    }
    




