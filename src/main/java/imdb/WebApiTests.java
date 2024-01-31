package imdb;

import java.io.IOException;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebElementCondition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class WebApiTests {

    private final ImdbApi imdbApi = new ImdbApi();

    @Test
    public void imdbTop100ChartTest() throws IOException {
        var top100 = imdbApi.getTop100Films();
        //System.out.println(top100);
        for (int i=0; i<100; i++) {
            Selenide.open(top100.get(i).getKey());
            var name = top100.get(i).getValue().get(0);
            Selenide.$(".hero__primary-text").shouldHave(text(top100.get(i).getValue().get(0).toString().substring(4,top100.get(i).getValue().get(0).toString().length())));
            Selenide.$(".sc-e226b0e3-3.dwkouE").shouldHave(text(top100.get(i).getValue().get(1).toString()));
            Selenide.$(".sc-bde20123-1.cMEQkK").shouldHave(text(top100.get(i).getValue().get(2).toString().substring(0,2)));
        }
    }
}