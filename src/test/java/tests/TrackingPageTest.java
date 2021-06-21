package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TrackingPage;

public class TrackingPageTest extends BaseTest {

    TrackingPage trackingPage;

    @BeforeMethod
    void fedexTrackingTest() {
        setup("chrome");
        driver.get("https://fedex.com/en-us/home.html");
        trackingPage = PageFactory.initElements(driver, TrackingPage.class);
        windowMaximize();
    }

    @Test
    void clickTracking(){
        trackingPage.clickTacking();
        trackingPage.sendTrackingId();
        trackingPage.clickTrack();

        quitDriver();
    }
    }










