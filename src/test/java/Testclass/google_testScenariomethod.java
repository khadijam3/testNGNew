package Testclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.GoolgesearchPageEle;
import pageobject.facbooksearchPageElement;

import java.util.concurrent.TimeUnit;

public class google_testScenariomethod {
    WebDriver driver;
    GoolgesearchPageEle objectRepo;

    @BeforeTest

    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

    }
    @Test(priority = 0)
     public void searchGoogleMethod(){
        GoolgesearchPageEle Page=new GoolgesearchPageEle(driver);
         Page.searchGoogle("facebook");

    }
    @Test(priority = 1)
    public void verifyandAcesseFacebook() {
        objectRepo = new GoolgesearchPageEle(driver);
        objectRepo.ClickFacebook();
    }
    @Test(priority = 2)
    public void verifyLogin() {
        facbooksearchPageElement facebookPage = new facbooksearchPageElement(driver);
        facebookPage.EnterUserName();
        facebookPage.EnterPassword();
        facebookPage.verifyLogin();

    }
        @AfterTest
    public void afterTest(){

        driver.quit();
    }

}