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

    final int TEN_SECONDS = 10;

    public GoogleElements(WebDriver driver) {
       this.driver = driver;
    }

    public void sendKeysOnSearchBar(String keys) {
        driver.findElement(searchBar).sendKeys(keys);
        driver.findElement(searchBar).sendKeys(Keys.ESCAPE);
    }

    public void clickOnSearchBtn() {
        WebElement clickSearchBtn = waitForWebElement(searchButton, TEN_SECONDS);
        clickSearchBtn.click();
    }

    public String getFocusUrl() {
        return driver.findElement(focusHref).getAttribute("href");
    }

    public void clickOnFocusUrl() {
        WebElement clickFocusUrl = waitForWebElement(focusHref, TEN_SECONDS);
        clickFocusUrl.click();
    }

    public boolean getNowHiringBtn() {
        WebElement nowHiringBtn = waitForWebElement(nowHiringButton, TEN_SECONDS);
        return nowHiringBtn.isDisplayed();
    }

    public void pageScrollDown() {
        js = (JavascriptExecutor) driver;
        js.executeScript(ExpectedValues.SCROLL_DOWN);
    }

    private WebElement waitForWebElement(By byElement, int seconds){
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(byElement));
    }

}
