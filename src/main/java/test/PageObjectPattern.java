package test;

import org.testng.annotations.Test;
import page.LoginPage;
import page.ProductPage;

public class PageObjectPattern {
    private final String url = "https://www.saucedemo.com/";
    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final String price1 = "$7.99";
    private final String price2 = "$9.99";
    private final String name = "N";
    private final String surname = "K";
    private final String zip = "22222";
    private final String fin = "Thank you for your order!";

    @Test
    public void success() {
        loginPage.open(url);
        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.addToCart(price1);
        productPage.addToCart(price2);
        productPage.checkCart(price1, price2);
        productPage.fillForm(name, surname, zip);
        productPage.getTaxes();
        productPage.finish(fin);
    }
}
