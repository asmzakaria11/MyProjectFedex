package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.Callable;

public class ScheduleAndPickUp {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement ClickShipping;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[5]/div/a")
    WebElement Schedule;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/p[6]/a")
    WebElement FrightPeakUp;

    @FindBy(xpath = "//select[@id='address.alternate.country']")
    WebElement Select;
    @FindBy(css = "input[id='address\\.alternate\\.company\\.ns']")
    WebElement Company;
    @FindBy(css = "input[id='address\\.alternate.contactName\\.ns']")
    WebElement Name;
    @FindBy(css = "input[id='address\\.accountAddressOne\\.field1']")
    WebElement Address1;
    @FindBy(css = "input[id='address\\.accountAddressTwo\\.field1']")
    WebElement Address2;
    @FindBy(css = "input[id='address\\.alternate\\.city1']")
    WebElement city;
    @FindBy(xpath = "//select[@id='address.accountStateProvince.field1']")
    WebElement StateSelect;
    @FindBy(css = "input[id='address\\.alternate\\.zipPostal']")
    WebElement zipCode;
    @FindBy(css = "input[id='address\\.alternate\\.phoneNumber']")
    WebElement phoneNo;
    @FindBy(css = "label[id='alert\\.pickup\\.nextday']")
    WebElement alartMesg;



    public void clickByShipping() {
        ClickShipping.click();
    }
    public void scheduleAndPeakUp() {
        Schedule.click();
    }
    public void frightPeakUpSchedule() {
        FrightPeakUp.click();
    }
    public void selectMethod() {
        Select select = new Select(Select);
        select.selectByIndex(3);
    }
    public void sendCompanyName(){
        Company.sendKeys("D Market");
    }
    public void sendName(){
        Name.sendKeys("Faruk Reza Talukder");
    }
    public void sendAddress1(){
        Address1.sendKeys("658 Washington St.");
    }
    public void sendAddress2(){
        Address2.sendKeys("Dorchaster");
    }
    public void sendCity(){
       city.sendKeys("Boston");
    }
    public void StateSelectMethod(){
        Select select = new Select(StateSelect);
        select.selectByIndex(22);
    }
    public void sendZipCode(){
        zipCode.sendKeys("02122");
    }
    public void sendPhoneNo(){
        phoneNo.sendKeys("8572468126");
    }

    public String myAlartMessage(){
        String text = alartMesg.getText();
        return text;


    }
}



