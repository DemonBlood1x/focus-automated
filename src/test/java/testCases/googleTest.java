package testCases;

import org.openqa.selenium.JavascriptExecutor;
import pages.GoogleElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;

public class googleTest extends GoogleElements {
    private static final String BASE_URL = "https://www.google.com/";
    private String linkFocus = "https://www.focusservices.com/";

    @Test
    public void searchGoogle() {
        BrowserSetUp setUp = new BrowserSetUp();
        setUp.browserSetUp(BASE_URL);

        googleSearchBar();
        googleSearchButton();
        Assert.assertEquals(linkFocus, focusUrl());
        focusClick();

        JavascriptExecutor js = (JavascriptExecutor) BrowserSetUp.DRIVER;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
