package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.BrowserSetUp;

public class GoogleElements {

    public static String SEARCH = "Focus Services";
    By searchBar = By.id("APjFqb");
    By searchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    By focusHref = By.xpath("//a[contains(@href,'https://www.focusservices.com')]");

    public void googleSearchBar() {
        BrowserSetUp.DRIVER.findElement(searchBar).sendKeys(SEARCH);
    }

    public void googleSearchButton() {
        BrowserSetUp.DRIVER.findElement(searchButton).click();
    }

    public String focusUrl() {
        String url;
        url = BrowserSetUp.DRIVER.findElement(focusHref).getAttribute("href");

        return url;
    }

    public void focusClick() {
        BrowserSetUp.DRIVER.findElement(focusHref).click();
    }


}
