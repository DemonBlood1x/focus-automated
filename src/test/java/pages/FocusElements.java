package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FocusElements {

    protected WebDriver driver;
    By locationTab = By.xpath("//a[contains(@href,'https://www.focusservices.com/locations/')]");
    By northAmericaLink = By.xpath("//a[contains(@href,'#north-america')]");
    By centerAmericaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[2]");
    By txtSVandNC = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[2]/div/div/section/div/h2");
    By asiaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[3]");
    By asiaTextBlock = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[3]/div/div/div[2]/section/div/h3/b");

    //Constructor
    public FocusElements(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnLocationTab() {
        driver.findElement(locationTab).click();
    }

    public String locateNorthAmerica() {
        return driver.findElement(northAmericaLink).getAttribute("href");
    }

    public void clickOnCenterAmerica() {
        driver.findElement(centerAmericaLink).click();
    }

    public String obtainTitle_SV_NC() {
        return driver.findElement(txtSVandNC).getText();
    }

    public void clickOnAsia() {
        driver.findElement(asiaLink).click();
    }

    public String obtainAsiaTextBlock() {
        return driver.findElement(asiaTextBlock).getText();
    }

}
