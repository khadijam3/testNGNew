package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class mobilePage {
    WebDriver driver;

    public mobilePage(WebDriver driver) {
        this.driver = driver;

    }

    By Moblebox = By.xpath("//*[@id='nav']/ol/li[1]/a");
    By DDBox = By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select");

    public void getPageTile() {
        String Title = driver.getTitle();
        System.out.println(Title);
    }

    public void mobileTitle() {
        driver.findElement(Moblebox).click();
        String Title1 = driver.getTitle();
        System.out.println(Title1);
    }

    public void getDDbyName() {
        WebElement dropDown = driver.findElement(DDBox);
        Select select = new Select(dropDown);
        select.selectByVisibleText("Name");

    }
}