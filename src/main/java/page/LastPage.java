package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LastPage {
    private final SelenideElement lastpage = $("#contents_wrapper");

    public void finish(String message) {
        lastpage.shouldHave(text(message));
    }
}
