package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InfoPage {
    private final SelenideElement name1 = $("#first-name");
    private final SelenideElement surname1 = $("#last-name");
    private final SelenideElement zip1 = $("#postal-code");
    private final SelenideElement continue1 = $("#continue");

    public void fillForm(String name, String surname, String zip) {
        name1.setValue(name);
        surname1.setValue(surname);
        zip1.setValue(zip);
        continue1.click();
    }
}
