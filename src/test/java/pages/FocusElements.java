package pages;

import org.openqa.selenium.By;
import setUp.BrowserSetUp;

public class FocusElements {

    By nowHiringButton = By.className("avia_iconbox_title");
    By locationTab = By.xpath("//a[contains(@href,'https://www.focusservices.com/locations/')]");
    By northAmericaLink = By.xpath("//a[contains(@href,'#north-america')]");
    By centerAmericaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[2]");

    public boolean focusNowHiringButton() {
        Boolean flag = BrowserSetUp.DRIVER.findElement(nowHiringButton).isDisplayed();
    return flag;
    }

    public void clickOnLocationTab() {
        BrowserSetUp.DRIVER.findElement(locationTab).click();
    }

    public String locateNorthAmerica() {
        String url;
        url = BrowserSetUp.DRIVER.findElement(northAmericaLink).getAttribute("href");
        return url;
    }

    public void clickOnCenterAmerica() {
        BrowserSetUp.DRIVER.findElement(centerAmericaLink).click();
    }

}
