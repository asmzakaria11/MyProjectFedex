package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class ManageAReturn {

    @FindBy(xpath = "//a[@data-analytics='hdr|tab|1|Shipping']")
    WebElement shipping;
    @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[1]/li/div/div[8]/div/a")
    WebElement aReturn;

    public void clickShipping(){
        shipping.click();
    }
    public void clickManageAReturn(){
        aReturn.click();
    }
}
