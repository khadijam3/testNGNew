package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class facbooksearchPageElement {
    WebDriver driver;

    public facbooksearchPageElement(WebDriver driver) {

        this.driver = driver;
    }
    By UserName_editbox = By.id("email");
    By Password_editbox = By.id("pass");
    By Login_Btn = By.name("login");

    public void EnterUserName() {
        driver.findElement(UserName_editbox).click();
            driver.findElement(UserName_editbox).sendKeys("Testuser");
    }
    public void EnterPassword() {
        driver.findElement(Password_editbox).click();
            driver.findElement(Password_editbox).sendKeys("Tester123");
        }
    public void verifyLogin() {
        driver.findElement(UserName_editbox).click();
            driver.findElement(Login_Btn).click();
            String title = driver.getTitle();
            assertEquals(title, "Facebook - Log In or Sign Up");


        }
    }
