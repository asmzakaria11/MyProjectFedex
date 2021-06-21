package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ScheduleAndPickUp;

public class ScheduleAndPickUpTest extends BaseTest {

    ScheduleAndPickUp schedule;

    @BeforeMethod
    void scheduleAndPickUp() {
        setup("chrome");
        driver.get("https://www.fedex.com/en-us/home.html");
        schedule = PageFactory.initElements(driver, ScheduleAndPickUp.class);
        windowMaximize();
        deleteCookies();
    }

    @Test
    void scheduleAndPickUpTest() {
        schedule.clickByShipping();
        schedule.scheduleAndPeakUp();
        implicitWait(5);
        schedule.frightPeakUpSchedule();
        schedule.selectMethod();
        implicitWait(5);
        schedule.sendCompanyName();
        schedule.sendName();
        schedule.sendAddress1();
        implicitWait(5);
        schedule.sendAddress2();
        schedule.sendCity();
        implicitWait(5);
        schedule.StateSelectMethod();
        implicitWait(5);
        schedule.sendZipCode();
        implicitWait(5);
        schedule.sendPhoneNo();

        String actual = schedule.myAlartMessage();
        Assert.assertEquals(actual, "\n" +
                "Please note that the current time is now past our standard cutoff time for scheduling a same-day pickup online: 15:00\n" +
                "If you need your shipment picked up today, please contact customer service at 866-393-4585.");

        quitDriver();
    }
}