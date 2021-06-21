package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShippingIdCreation {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement ClickShipping;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[1]/div/a")
    WebElement CreateShipment;

    @FindBy(xpath = "//div[@id='module.logon.newusers._expanded']/a[1]")
    WebElement CreateUseId;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id='initials']")
    WebElement Initial;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement LastName;

    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailId;

    @FindBy(xpath = "//input[@id='retypeEmail']")
    WebElement ReEnterEmailId;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement Address1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement Address2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement City;

    @FindBy(xpath = "//select[@id='state']")
    WebElement Select;

    @FindBy(xpath = "//input[@id='zip']")
    WebElement ZipCode;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement PhoneNo;

    @FindBy(xpath = "//input[@id='uid']")
    WebElement UserId;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id='retypePassword']")
    WebElement RePassword;

    @FindBy(xpath = "//*[@id=\"reminderQuestion\"]")
    WebElement selectQuestion;

    @FindBy(xpath = "//input[@id='reminderAnswer']")
    WebElement Answer;

    @FindBy(xpath = "//input[@id='acceptterms']")
    WebElement Acceptance;

    @FindBy(xpath = "//input[@id='createUserID']")
    WebElement Continue;
    @FindBy(css = "input[name='acceptterms']")
    WebElement clickOnBox;
    @FindBy(css="input[name='createUserID']")
    WebElement clickContinue;



    public void clickShipping() {
        ClickShipping.click();
    }
    public void clickByShipment() {
        CreateShipment.click();
    }
    public void clickOnThelink() {
        CreateUseId.click();
    }
    public void sendFirstName() {
        FirstName.sendKeys("ASM");
    }
    public void sendInitial() {
        Initial.sendKeys("Mr.");
    }
    public void sendLastName() {
        LastName.sendKeys("Zakaria");
    }
    public void sendEmailId() {
        EmailId.sendKeys("asmzakaria73@gmail.com");
    }
    public void reSendEmailId() {
        ReEnterEmailId.sendKeys("asmzakaria73@gmail.com");
    }
    public void sendAddress1() {
        Address1.sendKeys("1,Jara Court");
    }
    public void sendAddress2() {
        Address2.sendKeys("Newhyde Park");
    }
    public void sendCity() {
        City.sendKeys("NewYork");
    }
    public void selectMethod() {
        Select select = new Select(Select);
        select.selectByIndex(33);
    }
    public void sendZipCode() {
        ZipCode.sendKeys("11040");
    }
    public void sendPhoneNo() {
        PhoneNo.sendKeys("2673537447");
    }
    public void sendUserId() {
        UserId.sendKeys("zakaria7447444");
    }
    public void sendPassword() {
        Password.sendKeys("AhmedHasan10");
    }
    public void sendRePassword() {
        RePassword.sendKeys("AhmedHasan10");
    }
    public void selectQuestionMethod(){
        Select select = new Select(selectQuestion);
        select.selectByIndex(2);
    }
    public void sendAnswer() {
        Answer.sendKeys("Sylhet");
    }
    public void clickToTheBox(){
        clickOnBox.click();
    }
    public void clickOnContinue(){
        clickContinue.click();
    }
}







