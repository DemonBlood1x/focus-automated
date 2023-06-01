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

    //Constructor
    public FocusElements(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnLocationTab() {
        WebElement clickLocationTab = getWait().until(ExpectedConditions.elementToBeClickable(locationTab));
        clickLocationTab.click();
    }

    public String getNorthAmericaUrl(String hrfe) {
        WebElement link = getWait().until(ExpectedConditions.elementToBeClickable(northAmericaLink));
        return link.getAttribute(hrfe);
    }

    public void clickOnCenterAmerica() {
        WebElement clickCenterAmerica = getWait().until(ExpectedConditions.elementToBeClickable(centerAmericaLink));
        clickCenterAmerica.click();
    }

    public String getTitleSvNc() {
        WebElement title = getWait().until(ExpectedConditions.elementToBeClickable(getTitle_SV_NC));
        return title.getText();
    }

    public void clickOnAsia() {
        WebElement clickAsia = getWait().until(ExpectedConditions.elementToBeClickable(asiaLink));
        clickAsia.click();
    }

    public String getAsiaTextBlock() {
        WebElement asiaText = getWait().until(ExpectedConditions.elementToBeClickable(asiaTextBlock));
        return asiaText.getText();
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second explicit wait
    }


}
