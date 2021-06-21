package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.Callable;

public class RatesAndDeliveryTimes {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement clickShipping;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[4]/div/a")
    WebElement rates;

    @FindBy(xpath = "//li[@class='fdx-c-navbar__menu__item fdx-c-navbar__menu__item--has-submenu']")
    WebElement lbsRates;

    @FindBy(xpath = "//fdx-app-bar[@id='e2e-appBar']/nav/div[1]/ul/li[3]/ul/li[2]/button")
    WebElement rateTools;

    @FindBy(xpath = "//fdx-app-bar[@id='e2e-appBar']/nav/div[1]/ul/li[3]/ul/li[2]/ul/li[2]/a")
    WebElement rateSheet;

    @FindBy(xpath = "//button[@onclick='getStandardRates();']")
    WebElement standardRate;

    @FindBy(xpath = "//div[@id='container']/div[3]/div/div/ul/li[1]/label/a[2]")
    WebElement moreInformation;




    public void clickShipping() {
        clickShipping.click();
    }
    public void shippingRates(){
        rates.click();
    }
    public void ratesLbs(){
        lbsRates.click();
    }
    public void rateTools(){
        rateTools.click();
    }
    public void fedexRateSheet(){
        rateSheet.click();
    }
    public void getStandardRate(){ standardRate.click();}
    public void clickMoreInformation(){
        moreInformation.click();

    }

    }














