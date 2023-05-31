package actions;

import org.openqa.selenium.WebDriver;
import pages.FocusElements;

public class FocusPageActions {

    static FocusElements elements;

    static public String locateNorthAmericaAction(WebDriver driver) {
        elements = new FocusElements(driver);
        elements.clickOnLocationTab();
        return elements.locateNorthAmerica();
    }

    static public String obtainTitleSvNcAction(WebDriver driver) {
        elements = new FocusElements(driver);
        elements.clickOnLocationTab();
        elements.clickOnCenterAmerica();
        return elements.obtainTitle_SV_NC();
    }

    static public String obtainAsiaTextBlockAction(WebDriver driver) {
        elements = new FocusElements(driver);
        elements.clickOnLocationTab();
        elements.clickOnAsia();
        return elements.obtainAsiaTextBlock();
    }

}
