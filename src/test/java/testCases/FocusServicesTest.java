package testCases;

import org.openqa.selenium.WebDriver;
import pages.FocusElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;
import utils.FocusServicesUtilInterface;

public class FocusServicesTest extends FocusElements implements FocusServicesUtilInterface {

    @Test
    public void searchFocusServices() {
        BrowserSetUp setUp = new BrowserSetUp();
        setUp.browserSetUp(FOCUS_URL);

        Assert.assertTrue(focusNowHiringButton());
        clickOnLocationTab();
        Assert.assertEquals(LINK_USA, locateNorthAmerica());
        clickOnCenterAmerica();
        Assert.assertEquals(TITLE, obtainTitle_SV_NC());
        clickOnAsia();
        Assert.assertEquals(ASIA_TEXT, obtainAsiaTextBlock());
    }

}
