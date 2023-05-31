package pages;

import org.openqa.selenium.By;
import setUp.BrowserSetUp;

public class FocusElements {

    By nowHiringButton = By.className("avia_iconbox_title");
    By locationTab = By.xpath("//a[contains(@href,'https://www.focusservices.com/locations/')]");
    By northAmericaLink = By.xpath("//a[contains(@href,'#north-america')]");
    By centerAmericaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[2]");
    By txtSVandNC = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[2]/div/div/section/div/h2");
    By asiaLink = By.xpath("//*[@id='av-tab-section-1']/div/div[1]/a[3]");
    By asiaTextBlock = By.xpath("//*[@id='av-tab-section-1']/div/div[2]/div[3]/div/div/div[2]/section/div/h3/b");

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

    public String obtainTitle_SV_NC() {
        String title = BrowserSetUp.DRIVER.findElement(txtSVandNC).getText();
        return title;
    }

    public void clickOnAsia() {
        BrowserSetUp.DRIVER.findElement(asiaLink).click();
    }

    public String obtainAsiaTextBlock() {
        String text = BrowserSetUp.DRIVER.findElement(asiaTextBlock).getText();
        return text;
    }

}
