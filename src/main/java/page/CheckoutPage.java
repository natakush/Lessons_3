package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    private final SelenideElement Tax = $x("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]/text()[2]");
    private final SelenideElement Finish = $("#finish");

    public void getTaxes() {
        System.out.println(Tax.text());
        Finish.click();
    }
}
