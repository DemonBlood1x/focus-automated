package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FocusElements {

    protected WebDriver driver;
    By locationTab = By.xpath("//a[contains(@href,'https://www.focusservices.com/locations/')]");
    By northAmericaLink = By.xpath("//a[contains(@href,'#north-america')]");
    By centerAmericaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[2]");
    By getTitle_SV_NC = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[2]/div/div/section/div/h2");
    By asiaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[3]");
    By asiaTextBlock = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[3]/div/div/div[2]/section/div/h3/b");
    final int TEN_SECONDS = 10;

    //Constructor
    public FocusElements(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnLocationTab() {
        WebElement clickLocationTab = waitForWebElement(locationTab, TEN_SECONDS);
        clickLocationTab.click();
    }

    public String getNorthAmericaUrl(String hrfe) {
        return driver.findElement(northAmericaLink).getAttribute(hrfe);
    }

    public void clickOnCenterAmerica() {
        WebElement clickCenterAmerica = waitForWebElement(centerAmericaLink, TEN_SECONDS);
        clickCenterAmerica.click();
    }

    public String getTitleSvNc() {
        return driver.findElement(getTitle_SV_NC).getText();
    }

    public void clickOnAsia() {
        WebElement clickAsia = waitForWebElement(asiaLink, TEN_SECONDS);
        clickAsia.click();
    }

    public String getAsiaTextBlock() {
        return driver.findElement(asiaTextBlock).getText();
    }

    private WebElement waitForWebElement(By byElement, int seconds){
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(byElement));
    }

}
