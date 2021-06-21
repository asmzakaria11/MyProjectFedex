package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.Callable;

public class PackingAndShipping {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement shipping;

    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[6]/div/a")
    WebElement packingAndShipping;

    @FindBy(xpath = "//a[@aria-label='Create a<br>shipping label']")
    WebElement createLevel;

    @FindBy(xpath = "//input[@id='fx-from-name']")
    WebElement name;

    @FindBy(xpath = "//input[@id='fx-from-co']")
    WebElement company;

    @FindBy(xpath = "//select[@id='fx-from-country']")
    WebElement select1;

    @FindBy(xpath = "//input[@id='fx-from-addr1']")
    WebElement streetAddress;

    @FindBy(xpath = "//input[@id='fx-from-addr2']")
    WebElement aptAddress;

    @FindBy(xpath = "//input[@id='fx-from-zip']")
    WebElement zipCode;

    @FindBy(xpath = "//input[@id='fx-from-city']")
    WebElement city;

    @FindBy(xpath = "//select[@id='fx-from-state']")
    WebElement selectState;

    @FindBy(xpath = "//input[@id='fx-from-phone']")
    WebElement phone;

    @FindBy(css = "input[name=fx-from-email]")
    WebElement email;

    @FindBy(css = "input[name=fx-to-name]")
    WebElement recipient;

    @FindBy(css = "input[name=fx-to-co]")
    WebElement office;

    @FindBy(css = "select[name=fx-to-country]")
    WebElement selectCountry;

    @FindBy(css = "input[name=fx-to-addr1]")
    WebElement address1;

    @FindBy(css = "input[id=fx-to-addr2]")
    WebElement address2;

    @FindBy(css = "input[name=fx-to-zip]")
    WebElement zip;

    @FindBy(xpath = "//input[@id='fx-to-city']")
    WebElement cityName;

    @FindBy(css = "select[name='fx-to-state']")
    WebElement citySelect;

    @FindBy(css = "input[name=fx-to-phone]")
    WebElement cell;

    @FindBy(css = "input[name=fx-to-email]")
    WebElement putEmail;

    @FindBy(css = "input[id='fx-to-resident-delivery']")
    WebElement putClick;

    @FindBy(css = "button[id='fx-address-button']")
    WebElement nextPage;

    @FindBy(css = "div[id='fx-covidAlert']")
    WebElement covidTextMessage;


    public void clickShipping(){
        shipping.click();
    }
    public void clickPackingAndShipping(){
        packingAndShipping.click();
    }
    public void createAShippingLevel(){
        createLevel.click();
    }
    public void sendName(){
        name.sendKeys("ASM Zakaria");
    }
    public void sendCompanyName(){
       company.sendKeys("Erie Market");
      }
    public void selectMethod(){
        Select select = new Select(select1);
        select.selectByIndex(160);
    }
    public void sendStreetAdd(){
        streetAddress.sendKeys("111 Erie St.");
    }
    public void sendAptAddress(){
        aptAddress.sendKeys("A1");
    }
    public void sendZipCode(){
        zipCode.sendKeys("MA 02121");
    }
    public void sendCityName(){
        city.sendKeys("Boston");
    }
    public void stateSelect(){
        Select select = new Select(selectState);
        select.selectByIndex(22);
    }
    public void sendPhoneNo(){
        phone.sendKeys("8572495541");
    }
    public void sendEmail(){
        email.sendKeys("Khan7447@yahoo.com");
    }
    public void recipientName(){
        recipient.sendKeys("Alimur Reza Khan");
    }
    public void officeName(){
        office.sendKeys("Khan Associate ");
    }
    public void selectMethord(){
        Select select = new Select(selectCountry);
        select.selectByIndex(160);
      }
    public void sendAddress1(){
        address1.sendKeys("1 Jara Ct");
   }
    public void sendAddress2(){
        address2.sendKeys("Apt #1");
    }
    public void sendZip(){
        zip.sendKeys("11040");
    }
    public void sendCity(){
        cityName.click();
    }
    public void citySelect(){
        Select select=new Select(citySelect);
        select.selectByIndex(32);
    }
    public void cellPhone(){
        cell.sendKeys("8573184763");
    }
    public void sendEmailId(){
        putEmail.sendKeys("alimurrony1099@gmail.com");
    }
    public void clickToBox(){
        putClick.click();
    }
    public void clickToContinue(){
        nextPage.click();
    }
    public String covidTextMessage(){
        String text = covidTextMessage();
        return text;
    }

    }



