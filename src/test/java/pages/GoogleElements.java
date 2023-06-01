package pages;

import conf.ExpectedValues;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleElements {

    private WebDriver driver;
    JavascriptExecutor js;
    By searchBar = By.id("APjFqb");
    By searchButton = By.xpath("//input[contains(@class, 'gNO89b')]");
    By focusHref = By.xpath("//a[contains(@href,'https://www.focusservices.com')]");
    By nowHiringButton = By.className("avia_iconbox_title");

    public GoogleElements(WebDriver driver) {
       this.driver = driver;
    }

    public void sendKeysOnSearchBar(String keys) {
        WebElement search = getWait().until(ExpectedConditions.elementToBeClickable(searchBar));
        search.sendKeys(keys);
        driver.findElement(searchBar).sendKeys(Keys.ESCAPE);
    }

    public void clickOnSearchBtn() {
        WebElement clickSearchBtn = getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        clickSearchBtn.click();
    }

    public String getFocusUrl() {
        WebElement focusSiteUrl = getWait().until(ExpectedConditions.elementToBeClickable(focusHref));
        return focusSiteUrl.getAttribute("href");
    }

    public void clickOnFocusUrl() {
        WebElement clickFocusUrl = getWait().until(ExpectedConditions.elementToBeClickable(focusHref));
        clickFocusUrl.click();
    }

    public boolean getNowHiringBtn() {
        WebElement nowHiringBtn = getWait().until(ExpectedConditions.elementToBeClickable(nowHiringButton));
        return nowHiringBtn.isDisplayed();
    }

    public void pageScrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript(ExpectedValues.SCROLL_DOWN);
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second explicit wait
    }

}
