package utils;

import setUp.BrowserSetUp;

public interface FocusServicesUtilInterface {
    String FOCUS_URL = "https://www.focusservices.com/";
    String LINK_USA = "https://www.focusservices.com/locations/#north-america";
    String TITLE = "El Salvador & Nicaragua";
    String ASIA_TEXT = "Bacolod City, Philippines";
    BrowserSetUp setUp = new BrowserSetUp();

    default void browserUp() {
        setUp.browserSetUp(FOCUS_URL);
    }

    default void browserDown() {
        setUp.closeAll();
    }
}
