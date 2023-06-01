package actions;

import conf.ExpectedValues;
import org.openqa.selenium.WebDriver;
import pages.GoogleElements;

public class GooglePageActions {

    GoogleElements elements;

    public GooglePageActions (WebDriver driver) {
        elements = new GoogleElements(driver);
    }

    public String getFocusUrlAction() {
        elements.sendKeysOnSearchBar(ExpectedValues.SEARCH);
        elements.clickOnSearchBtn();
        return elements.getFocusUrl();
    }

    public boolean locateNowHiringButtonAction() {
         elements.sendKeysOnSearchBar(ExpectedValues.SEARCH);
         elements.clickOnSearchBtn();
         elements.clickOnFocusUrl();
         elements.pageScrollDown();
         return elements.getNowHiringBtn();
    }

}
