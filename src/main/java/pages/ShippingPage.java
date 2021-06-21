package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement clickByShipping;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[1]/div/a")
    WebElement createAShipment;

    @FindBy(xpath = "//*[@id=\"module.logon._expanded\"]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/input")
    WebElement userId;

    @FindBy(xpath = "//div[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
    WebElement passWord;

    @FindBy(xpath = "//div[@id='module.logon._expanded']/table/tbody/tr[6]/td/table/tbody/tr/td[3]/input")
    WebElement logIn;


    public void clickShipping() {
        clickByShipping.click();
    }

    public void createAShipment() {
        createAShipment.click();
    }

    public void sendUserId() {
        userId.sendKeys("Zak23456");
    }

    public void sendPassWord(){
        passWord.sendKeys("aLimur2233");
    }
    public void logIn(){
        logIn.click();
    }


    }








