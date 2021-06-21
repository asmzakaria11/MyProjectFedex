package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver-v0.29.1-win32/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    void implicitWait(long wait) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    void windowMaximize() {
        driver.manage().window().maximize();

    }

    void deleteCookies() {
        driver.manage().deleteAllCookies();
        ;
    }

    public void screenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("./screenShort"));
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}



