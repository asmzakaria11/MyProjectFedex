package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternationalShippingGuide {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement shipping;
    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[7]/div/a")
    WebElement shippingGuide;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/div/ul/li[2]/a")
    WebElement shipInternationally;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[1]/div/div[2]/div[1]/div/a")
    WebElement step1;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[3]/div/div[2]/div[1]/div/a")
    WebElement step2;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[5]/div/div[2]/div[1]/div/a")
    WebElement step3;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[7]/div/div[2]/div[1]/div/a")
    WebElement step4;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[9]/div/div[2]/div[1]/div/a")
    WebElement step5;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[11]/div/div[2]/div[1]/div/a")
    WebElement step6;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[13]/div/div[2]/div[1]/div/a")
    WebElement step7;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div[6]/div/div[1]/div[15]/div/div[2]/div[1]/div/a")
    WebElement step8;

    public void clickShipping(){
        shipping.click();
    }
    public void internationalShippingGuide(){
        shippingGuide.click();
    }
    public void howToShipInternationally(){
        shipInternationally.click();
    }
    public void clickStep1(){
        step1.click();
    }
    public void clickStep2(){
        step2.click();
    }
    public void clickStep3(){
        step3.click();
    }
    public void clickStep4(){
        step4.click();
    }
    public void clickStep5(){
        step5.click();

    }public void clickStep6(){
        step6.click();
    }
    public void clickStep7(){
        step7.click();
    }
    public void clickStep8(){
        step8.click();
    }

}
