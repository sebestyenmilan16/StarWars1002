import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SwapiService {
    public static String getFilmsJson(String urlFilms) {

        HttpClient http = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(urlFilms))
                .build();

        HttpResponse<String> res = null;

        try {
            res = http.send(req, HttpResponse.BodyHandlers.ofString());
            return res.body();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
