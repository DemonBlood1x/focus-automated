package testCases;

import actions.GooglePageActions;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.GoogleUtilInterface;

public class GoogleTestRun {
    WebDriver driver;

    private static final String HEADLESS = "headless";
    ChromeOptions chromeOptions;

    @BeforeTest
    public void setup() {
        chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments(HEADLESS);
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("disable-gpu");
        driver = new ChromeDriver(chromeOptions);
        driver.get(GoogleUtilInterface.BASE_URL);
    }

    @Description("Test1: Verify focus URL")
    @Test(priority = 1)
    public void verifyFocusUrl() {
        Assert.assertEquals(GoogleUtilInterface.LINK_FOCUS, GooglePageActions.obtainFocusUrlAction(driver));
    }

    @Description("Test2: Verify Now Hiring Button")
    @Test(priority = 2)
    public void verifyNowHiringButton() {
        Assert.assertTrue(GooglePageActions.locateNowHiringButtonAction(driver));
    }
/*
    @AfterTest
    public void closeAll() {
        driver.close();
    }
*/
}
