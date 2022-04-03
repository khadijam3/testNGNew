package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoolgesearchPageEle {
    WebDriver driver;
   public GoolgesearchPageEle(WebDriver driver) {

       this.driver = driver;
    }

    By searchBox = By.xpath("//input[@name = 'q']");
    By search_Btn = By.xpath("(//input[@name='btnK'])[1]");
    By faceBook_Link = By.xpath("//a//h3[text()='Facebook - Log In or Sign Up']");

    public void searchGoogle(String searchInput) {
        try {
            driver.findElement(searchBox).sendKeys(searchInput);
            Thread.sleep(1000);
            driver.findElement(search_Btn).click();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("exception Caught" + e.getMessage());
        }
    }

    public void ClickFacebook() {
        try {
            driver.findElement(faceBook_Link).click();
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("exception Caught" + e.getMessage());
        }
    }
}
