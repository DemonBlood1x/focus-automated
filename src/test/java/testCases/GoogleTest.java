package testCases;

import jdk.jfr.Description;
import org.openqa.selenium.JavascriptExecutor;
import pages.GoogleElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;
import utils.GoogleUtilInterface;

public class GoogleTest extends GoogleElements implements GoogleUtilInterface {

    @Description("Test1: Verify focus URL")
    @Test
     public void verifyFocusUrl() {
        browserUp();
        googleSearchBar();
        googleSearchButton();
        Assert.assertEquals(LINK_FOCUS, focusUrl());
        browserDown();
    }

    @Description("Test2: Verify Now Hiring Button")
    @Test
    public void verifyNowHiringButton() {
        browserUp();
        googleSearchBar();
        googleSearchButton();
        focusClick();
        JavascriptExecutor js = (JavascriptExecutor) BrowserSetUp.DRIVER;
        js.executeScript(SCROLL_DOWN);
        //Assert.assertTrue(focusNowHiringButton());
        browserDown();
    }

}
