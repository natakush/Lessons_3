package l10;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Googletr {

    @org.testng.annotations.Test
    public void GoogleTrans() {
        open("https://translate.google.com/?hl=en&tab=TT&sl=uk&tl=en&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("I will study TestNG cool"));
        open("https://translate.google.com/?hl=uk&tab=TT&sl=uk&tl=no&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Jeg vil studere testng kult"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=es&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Estudiaré testng genial"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=de&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ich werde testng cool studieren"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=it&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Studierò Testng Cool"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=sq&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Unë do të studioj testng të freskëta"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=bg&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ще проуча тестова готина"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=lb&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ech studéieren TESTGE COOL"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=nl&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ik zal testng cool bestuderen"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=pl&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Badam testng fajny"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=pt&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Vou estudar testng legal"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=ro&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Voi studia testng cool"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=sk&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Budem študovať testng cool"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=th&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("ฉันจะศึกษา testng เย็น"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=tg&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ман софро меомӯзам"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=kri&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("I go stɔdi testng kul ."));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=tr&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Testng serin çalışacağım"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=tk&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Testnget-i gowy öwrenerin"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=uz&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Men testni yaxshi ko'raman"));
        open("https://translate.google.com/?hl=uk&sl=uk&tl=ny&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20TestNG&op=translate");
        $("span.ryNqvb").shouldHave(text("Ndiphunzira kuziziritsa"));

    }
}
