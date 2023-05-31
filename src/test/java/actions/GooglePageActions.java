package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.GoogleElements;
import utils.GoogleUtilInterface;

public class GooglePageActions {

    static GoogleElements elements;
    static JavascriptExecutor js;

     static public String obtainFocusUrlAction(WebDriver driver) {
        elements = new GoogleElements(driver);
        elements.searchKeysInGoogle(GoogleUtilInterface.SEARCH);
        elements.googleSearchButton();
        return elements.focusUrl();
    }

    static public boolean locateNowHiringButtonAction(WebDriver driver) {
         elements = new GoogleElements(driver);
         elements.searchKeysInGoogle(GoogleUtilInterface.SEARCH);
         elements.googleSearchButton();
         elements.focusClick();
         js = (JavascriptExecutor) driver;
         js.executeScript(GoogleUtilInterface.SCROLL_DOWN);
         return elements.focusNowHiringButton();
    }

}
