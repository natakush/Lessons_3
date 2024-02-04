package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Collection;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    private final ElementsCollection ProductList = $$("#inventory_container");
    private final SelenideElement Cart = $("#shopping_cart_container > a");

    public void addToCart(String price) {
        for (int i=0; i<ProductList.size(); i++) {
            if (ProductList.get(i).find(price).exists()) {
                ProductList.get(i).find("Add to cart").click();
            }
        }
        Cart.click();
    }
}
