package utils;

import setUp.BrowserSetUp;

public interface GoogleUtilInterface {
    String BASE_URL = "https://www.google.com/";
    String LINK_FOCUS = "https://www.focusservices.com/";
    String SCROLL_DOWN= "window.scrollBy(0,document.body.scrollHeight)";
    BrowserSetUp setUp = new BrowserSetUp();

    default void browserUp() {
        setUp.browserSetUp(BASE_URL);
    }

    default void browserDown() {
        setUp.closeAll();
    }

}
