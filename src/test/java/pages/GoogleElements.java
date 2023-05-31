package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.GoogleUtilInterface;

public class GoogleElements {

    protected WebDriver driver;
    By searchBar = By.id("APjFqb");
    By searchButton = By.xpath("//input[contains(@class, 'gNO89b')]");
    By focusHref = By.xpath("//a[contains(@href,'https://www.focusservices.com')]");
    By nowHiringButton = By.className("avia_iconbox_title");

    //Constructor
    public GoogleElements(WebDriver driver){
        this.driver=driver;
    }

    public void searchKeysInGoogle(String keys) {
        driver.findElement(searchBar).sendKeys(keys);
        driver.findElement(searchBar).sendKeys(Keys.ESCAPE);
    }

    public void googleSearchButton() {
        driver.findElement(searchButton).click();
    }

    public String focusUrl() {
        return driver.findElement(focusHref).getAttribute("href");
    }

    public void focusClick() {
        driver.findElement(focusHref).click();
    }

    public boolean focusNowHiringButton() {
        return driver.findElement(nowHiringButton).isDisplayed();
    }

}
