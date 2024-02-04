package test;

import org.testng.annotations.Test;
import page.*;

public class PageObjectPattern {
    private final String url = "https://www.saucedemo.com/";
    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final InfoPage infoPage = new InfoPage();
    private final CheckoutPage checkoutPage = new CheckoutPage();
    private final LastPage lastPage = new LastPage();
    private final String price1 = "7.99";
    private final String price2 = "9.99";

    @Test
    public void success() {
        loginPage.open(url);
        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.addToCart(price1);
        productPage.addToCart(price2);
        cartPage.checkCart(price1, price2);
        infoPage.fillForm("N", "K", "22222");
        checkoutPage.getTaxes();
        lastPage.finish("Thank you for your order!");
    }
}
