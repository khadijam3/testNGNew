package Testclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobject.mobilePage;

import java.util.concurrent.TimeUnit;

public class mobileTest {
    WebDriver driver;
    mobilePage MP;
    @BeforeTest

    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://live.techpanda.org/");
    }
        @Test
        public void titleVerification() {
            MP =new mobilePage(driver);
            MP.getPageTile();
            MP.mobileTitle();
            MP.getDDbyName();

        }

    @AfterTest
    public void teardown(){
    driver.close();

    }}
