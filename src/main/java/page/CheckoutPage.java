package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckoutPage {
    private final SelenideElement tax = $x("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]/text()[2]");
    private final SelenideElement total = $x("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]/text()[2]");
    private final SelenideElement finish = $("#finish");

    public void getTaxes() {
        System.out.println("Tax percent: " + Integer.parseInt(tax.text())/Integer.parseInt(total.text()));
        finish.click();
    }
}
