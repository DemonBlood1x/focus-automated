package tests;

import actions.FocusPageActions;
import conf.ChromeBrowser;
import actions.GooglePageActions;
import conf.ExpectedValues;
import conf.TestConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FocusTestSuite {
    private GooglePageActions action;
    private FocusPageActions action2;
    private WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup() {
        driver = ChromeBrowser.chromeDriverConnection(new ChromeOptions());
        action = new GooglePageActions(driver);
        action2 = new FocusPageActions(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    @Description("Test 1: Verify if the focus site URL matches the original")
    @Test(priority = 1)
    public void verifyFocusUrl() {
        driver.get(TestConfiguration.BASE_GOOGLE_URL);
        String focusSiteURL = action.getFocusUrlAction();
        Assert.assertEquals(focusSiteURL, ExpectedValues.FOCUS_SITE_URL);
    }

    @Description("Test 2: Verify if Now Hiring Button exists")
    @Test(priority = 2)
    public void verifyNowHiringButton() {
        driver.get(TestConfiguration.BASE_GOOGLE_URL);
       boolean isNowHiringBtnSelected = action.locateNowHiringButtonAction();
       Assert.assertTrue(isNowHiringBtnSelected);
    }

    @Description("Test 3: Verify if the North America Link matches the original")
    @Test(priority = 3)
    public void verifyNorthAmericaLink() {
        driver.get(TestConfiguration.BASE_FOCUS_URL);
        String northAmericaLink = action2.locateNorthAmericaAction();
        Assert.assertEquals(northAmericaLink, ExpectedValues.FOCUS_USA_LINK);
    }

    @Description("Test 4: Verify if the Central America title matches the original")
    @Test(priority = 4)
    public void verifyCentralAmericaTitle() {
        driver.get(TestConfiguration.BASE_FOCUS_URL);
        String titleSvNc = action2.getTitleSvNcAction();
        Assert.assertEquals(titleSvNc, ExpectedValues.SA_NC_TITLE);
    }

    @Description("Test 5: Verify if the Asia Text Block matches the original")
    @Test(priority = 5)
    public void verifyAsiaTextBlock() {
        driver.get(TestConfiguration.BASE_FOCUS_URL);
        String asiaTxtBlock = action2.getAsiaTextBlockAction();
        Assert.assertEquals(asiaTxtBlock, ExpectedValues.ASIA_TEXT);
    }

}
