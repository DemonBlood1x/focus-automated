package actions;

import conf.ExpectedValues;
import org.openqa.selenium.WebDriver;
import pages.FocusElements;

public class FocusPageActions {

    FocusElements elements;

    public FocusPageActions(WebDriver driver) {
        this.elements = new FocusElements(driver);
    }

     public String locateNorthAmericaAction() {
        elements.clickOnLocationTab();
        return elements.getNorthAmericaUrl(ExpectedValues.HREF);
    }

     public String getTitleSvNcAction() {
        elements.clickOnLocationTab();
        elements.clickOnCenterAmerica();
        return elements.getTitleSvNc();
    }

     public String getAsiaTextBlockAction() {
        elements.clickOnLocationTab();
        elements.clickOnAsia();
        return elements.getAsiaTextBlock();
    }

}
