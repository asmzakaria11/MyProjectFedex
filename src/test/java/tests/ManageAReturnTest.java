package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ManageAReturn;

public class ManageAReturnTest extends BaseTest{

    ManageAReturn aReturn;

    @BeforeMethod
    void manageAReturn(){
        setup("chrome");
        driver.get("https://fedex.com/en-us/home.html");
        aReturn = PageFactory.initElements(driver,ManageAReturn.class);
        windowMaximize();
        deleteCookies();
    }
    @Test
    void clickShipping(){
        aReturn.clickShipping();
        aReturn.clickManageAReturn();

        quitDriver();
    }
}
