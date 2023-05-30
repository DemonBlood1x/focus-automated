package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleElements {

    WebDriver driver;

    public static String BASE_URL = "www.google.com";
    public static String HEADLESS = "headless";
    public static String SEARCH = "Focus Services";

    By searchBar = By.id("APjFqb");
    By searchButton = By.name("btnK");

    public void googleSearchBar() {
        driver.findElement(searchBar).sendKeys(SEARCH);
    }

    public void googleSearchButton() {
        driver.findElement(searchButton).click();
    }


}
