package testCases;

import org.openqa.selenium.JavascriptExecutor;
import pages.GoogleElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;
import utils.GoogleUtilInterface;

public class GoogleTest extends GoogleElements implements GoogleUtilInterface {

    @Test
    public void searchGoogle() {
        BrowserSetUp setUp = new BrowserSetUp();
        setUp.browserSetUp(BASE_URL);

        googleSearchBar();
        googleSearchButton();
        Assert.assertEquals(LINK_FOCUS, focusUrl());
        focusClick();

        JavascriptExecutor js = (JavascriptExecutor) BrowserSetUp.DRIVER;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
}
