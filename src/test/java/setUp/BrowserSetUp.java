package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserSetUp {

    private static final String HEADLESS = "headless";
    ChromeOptions chromeOptions;
    public static WebDriver DRIVER;

    @BeforeTest
    public void browserSetUp(String url) {
        chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments(HEADLESS);
        chromeOptions.addArguments("disable-gpu");
        DRIVER = new ChromeDriver(chromeOptions);
        DRIVER.get(url);
    }

    @AfterTest
    public void closeAll() {
        BrowserSetUp.DRIVER.close();
    }

}
