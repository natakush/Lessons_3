package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement cartList = $("#cart_contents_container > div > div.cart_list");
    private final SelenideElement checkout = $("#checkout");

    public void checkCart(String price1, String price2) {
        cartList.shouldHave(text(price1));
        cartList.shouldHave(text(price2));
        checkout.click();
    }
}
