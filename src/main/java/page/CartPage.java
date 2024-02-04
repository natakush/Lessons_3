package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement CartList = $("#cart_contents_container > div > div.cart_list");
    private final SelenideElement Checkout = $("#checkout");

    public void checkCart(String price1, String price2) {
        CartList.shouldHave(text(price1));
        CartList.shouldHave(text(price2));
        Checkout.click();
    }
}
