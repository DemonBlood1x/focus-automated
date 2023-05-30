package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetUp {

    private static String HEADLESS = "headless";
    ChromeOptions chromeOptions;
    public static WebDriver DRIVER;

    public void browserSetUp(String url) {
        chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments(HEADLESS);
        //chromeOptions.addArguments("disable-gpu");
        DRIVER = new ChromeDriver(chromeOptions);
        DRIVER.get(url);
    }

}
