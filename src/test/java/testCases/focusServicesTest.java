package testCases;

import org.openqa.selenium.WebDriver;
import pages.FocusElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUp.BrowserSetUp;

public class focusServicesTest extends FocusElements {

    private static final String FOCUS_URL = "https://www.focusservices.com/";
    private String linkUSA = "https://www.focusservices.com/locations/#north-america";
    private String title = "El Salvador & Nicaragua";
    private String asiaText = "Bacolod City, Philippines";

    @Test
    public void searchFocusServices() {
        BrowserSetUp setUp = new BrowserSetUp();
        setUp.browserSetUp(FOCUS_URL);

        Assert.assertTrue(focusNowHiringButton());
        clickOnLocationTab();
        Assert.assertEquals(linkUSA, locateNorthAmerica());
        clickOnCenterAmerica();
        Assert.assertEquals(title, obtainTitle_SV_NC());
        clickOnAsia();
        Assert.assertEquals(asiaText, obtainAsiaTextBlock());
    }

}
