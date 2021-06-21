package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLogIn {
    @FindBy(xpath = "//*[@id='fxg-dropdown-signIn']/span")
    WebElement clickByWareHouse;

    @FindBy(xpath = "//*[@id='NavLoginUserId']")
    WebElement userLogIn;

    @FindBy(xpath = "//*[@id='NavLoginPassword']")
    WebElement passWord;

    @FindBy(xpath = "//*[@id='HeaderLogin']/button")
    WebElement logIn;

    @FindBy(xpath = "//div[@id='loginNoErrorFillMsg']")
    WebElement wrongTextMsg;


    public void setClickByWareHouse() {
        clickByWareHouse.click();
    }

    public void sendUserLogIn(){
        userLogIn.sendKeys("Zakaria");

    }

    public void sendPassword(){
        passWord.sendKeys("Zakaria123");

    }
    public void clickLogIn(){
        logIn.click();

    }
    public String copyWrongTextMsg(){
        String text = wrongTextMsg.getText();
        return text;
    }
}
