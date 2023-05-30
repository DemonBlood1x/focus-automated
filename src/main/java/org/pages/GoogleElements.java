package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleElements {

    WebDriver driver;
    public static String SEARCH = "Focus Services";

    WebDriverWait wait;
    By searchBar = By.id("APjFqb");
    By searchButton = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");
    By focusHref = By.xpath("//a[contains(@href,'https://www.focusservices.com')]");

    public GoogleElements(WebDriver driver) {
        this.driver = driver;
    }

    public void googleSearchBar() {
        driver.findElement(searchBar).sendKeys(SEARCH);
    }

    public void googleSearchButton() {
        driver.findElement(searchButton).click();
    }

    public String focusUrl() {
        String url;
        url = driver.findElement(focusHref).getAttribute("href");

        return url;
    }

    public void focusClick() {
        driver.findElement(focusHref).click();
    }


}
