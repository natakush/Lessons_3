package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InfoPage {
    private final SelenideElement Name = $("#first-name");
    private final SelenideElement Surname = $("#last-name");
    private final SelenideElement Zip = $("#postal-code");
    private final SelenideElement Continue = $("#continue");

    public void fillForm(String name, String surname, String zip) {
        Name.setValue(name);
        Surname.setValue(surname);
        Zip.setValue(zip);
        Continue.click();
    }
}
