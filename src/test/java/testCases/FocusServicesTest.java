package testCases;

import jdk.jfr.Description;
import pages.FocusElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.FocusServicesUtilInterface;

public class FocusServicesTest extends FocusElements implements FocusServicesUtilInterface {

    @Test
    public void verifyNorthAmericaLink() {
        browserUp();
        clickOnLocationTab();
        Assert.assertEquals(LINK_USA, locateNorthAmerica());
        browserDown();
    }

    @Test
    public void verifyCentralAmericaTextBlock() {
        browserUp();
        clickOnLocationTab();
        clickOnCenterAmerica();
        Assert.assertEquals(TITLE, obtainTitle_SV_NC());
        browserDown();
    }

    @Test
    public void verifyAsiaTextBlock() {
        browserUp();
        clickOnLocationTab();
        clickOnAsia();
        Assert.assertEquals(ASIA_TEXT, obtainAsiaTextBlock());
        browserDown();
    }

}
