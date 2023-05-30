package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.BrowserSetUp;

public class FocusElements {

    By nowHiringButton = By.className("avia_iconbox_title");
    By locationTab = By.className("avia-menu-text");

    public boolean focusNowHiringButton() {
        Boolean flag = BrowserSetUp.DRIVER.findElement(nowHiringButton).isDisplayed();
    return flag;
    }

    public void clickOnLocationTab() {
        BrowserSetUp.DRIVER.findElement(locationTab).click();
    }

}
