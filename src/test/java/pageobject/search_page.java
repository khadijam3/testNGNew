package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_page{
    WebDriver driver;

    public search_page(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
//
//    @FindBy(xpath = "//input[@name = 'q']")
//    public WebElement searchBox;
//    @FindBy(xpath = "(//input[@name='btnK'])[1]")
//    public WebElement search_Btn;
//    @FindBy(xpath = "//a//h3[text()='Facebook - Log In or Sign Up']")
//    public WebElement facebook_link;
//
//
//    public void s(String searchInput) {
//        try {
//            driver.findElement((By) searchBox).sendKeys(searchInput);
//            Thread.sleep(1000);
//            driver.findElement((By) search_Btn).click();
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println("exception Caught" + e.getMessage());
//        }
//    }
//
//    public void ClickFacebook() {
//        try {
//            driver.findElement((By) facebook_link).click();
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println("exception Caught" + e.getMessage());
//        }
//    }
}


