package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LastPage {
    private final SelenideElement Lastpage = $("#contents_wrapper");

    public void finish(String message) {
        Lastpage.shouldHave(text(message));
    }
}
