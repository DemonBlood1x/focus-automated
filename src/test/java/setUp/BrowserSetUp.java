package setUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.FocusElements;
import org.pages.GoogleElements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserSetUp {

    private static  final String HTTPS = "https://";
    private static final String BASE_URL = "www.google.com";
    private static final String FOCUS_URL = "www.focusservices.com/";
    private static String HEADLESS = "headless";
    WebDriver driver;
    ChromeOptions chromeOptions;
    GoogleElements elements;

    final Logger logger = LoggerFactory.getLogger(BrowserSetUp.class);

    @BeforeTest
    public void setUp() {
        chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments(HEADLESS);
        driver = new ChromeDriver(chromeOptions);
        driver.get(HTTPS+BASE_URL);
    }

    @Test
    public void searchGoogle() {
        elements = new GoogleElements(driver);
        System.out.println("TEST--->");
        elements.googleSearchBar();
        elements.googleSearchButton();
        System.out.println(elements.focusUrl());

        Assert.assertEquals(HTTPS+FOCUS_URL, elements.focusUrl());

        elements.focusClick();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @AfterTest
    public void closeAllThreads() throws InterruptedException {
        //driver.wait(10);
        //driver.quit();
    }

}
