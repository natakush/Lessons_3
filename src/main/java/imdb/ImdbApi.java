package imdb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class ImdbApi {

    public final ImdbRestClient client = new ImdbRestClient();

    public ResponseBody getTopChartResponse() throws IOException {
        return client.books.getTopChart().execute().body();
    }

    public LinkedHashMap<String, List> getTopChart() throws IOException {
        var htmlString = getTopChartResponse().string();
        var document = Jsoup.parse(htmlString);
        var ipcTitleElements = document.select(".ipc-metadata-list-summary-item");

        var allFilms = new LinkedHashMap<String, List>();

        for (Element ipcTitleElement : ipcTitleElements) {
            var aTag = ipcTitleElement.select("a").first();
            var href = aTag.attr("href");
            var link = ImdbRestClient.BASE_URL + href;

            var h3Text = ipcTitleElement.select("h3.ipc-title__text").text();
            var rating = ipcTitleElement.select("span.ipc-rating-star").first().text();
            var year = ipcTitleElement.select("span.sc-1e00898e-8.hsHAHC.cli-title-metadata-item").first().text();

            var list = new ArrayList<>();
            list.add(h3Text);
            list.add(year);
            list.add(rating);
            allFilms.put(link, list);
        }
        return allFilms;
    }

    public List<Map.Entry<String, List>> getTop100Films() throws IOException {
        return getTopChart().entrySet().stream().limit(100).toList();
    }

}