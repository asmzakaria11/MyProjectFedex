package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrackingPage {

  @FindBy(xpath = "/html/body/div[1]/header/div/div/nav/div/ul/div[2]/li/a/span")
  WebElement ClickTracking;
  @FindBy(xpath ="//*[@id='HomeTrackingApp']/div/input[1]")
  WebElement SendTracingId;
  @FindBy(xpath = "/html/body/div[1]/header/div/div/div")
  WebElement ClickTrack;



  public void clickTacking() {
    ClickTracking.click();
  }
  public void sendTrackingId(){
    SendTracingId.sendKeys("Zak267353");
  }
  public void clickTrack(){
    ClickTrack.click();
  }
}















