package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.GoogleElements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserSetUp extends GoogleElements {
    WebDriver driver;
    ChromeOptions chromeOptions;
    GoogleElements elements;

    final Logger logger = LoggerFactory.getLogger(BrowserSetUp.class);

    @BeforeTest
    public void setUp() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(HEADLESS);
        driver = new ChromeDriver(chromeOptions);
        driver.get(BASE_URL);
    }

    @Test
    public void searchGoogle() {

        logger.info(getClass().getName() + ": " + "homePage");
    }

}
