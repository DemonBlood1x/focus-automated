package testCases;

import actions.FocusPageActions;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.FocusServicesUtilInterface;

public class FocusTestRun {

    WebDriver driver;
    ChromeOptions chromeOptions;

    @BeforeTest
    public void setup() {
        chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments(HEADLESS);
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("disable-gpu");
        driver = new ChromeDriver(chromeOptions);
        driver.get(FocusServicesUtilInterface.FOCUS_URL);
    }

    @Description("Test1: Verify North America Link")
    @Test(priority = 1)
    public void verifyNorthAmericaLink() {
        Assert.assertEquals(FocusServicesUtilInterface.LINK_USA, FocusPageActions.locateNorthAmericaAction(driver));
    }

    @Description("Test2: Verify North America Text Block")
    @Test(priority = 2)
    public void verifyCentralAmericaTextBlock() {
        Assert.assertEquals(FocusServicesUtilInterface.TITLE, FocusPageActions.obtainTitleSvNcAction(driver));
    }

    @Description("Test3: Verify Asia Text Block")
    @Test(priority = 3)
    public void verifyAsiaTextBlock() {
        Assert.assertEquals(FocusServicesUtilInterface.ASIA_TEXT, FocusPageActions.obtainAsiaTextBlockAction(driver));
    }

    @AfterTest
    public void closeAll() {
        driver.close();
    }

}
