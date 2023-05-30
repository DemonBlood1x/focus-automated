package testCases;

import org.openqa.selenium.WebDriver;
import pages.FocusElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;

public class focusServicesTest extends FocusElements {

    private static final String FOCUS_URL = "https://www.focusservices.com/";

    @Test
    public void searchFocusServices() {
        BrowserSetUp setUp = new BrowserSetUp();
        setUp.browserSetUp(FOCUS_URL);

        //Assert.assertTrue(focusNowHiringButton());
        clickOnLocationTab();
    }

}
