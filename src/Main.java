import  javax.json.*;
import java.io.StringReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        String filmsJson = SwapiService.getFilmsJson("https://swapi.info/api/films");
        //System.out.println(filmsJson);

        JsonReader reader = Json.createReader(new StringReader(filmsJson));
        JsonArray films = reader.readArray();
        for (int i = 0; i < films.size(); i++) {
            JsonObject film = films.getJsonObject(i); // és NEM films[i]
            String title = film.getString("title");
            int id = film.getInt("episode_id");
            String open = film.getString("opening_crawl");
            String director = film.getString("director");
            String producer = film.getString("producer");
            String releasedate = film.getString("release_date");
            LocalDate date = LocalDate.parse(releasedate);
            String url = film.getString("url");

            System.out.println("Title: "+title);
            System.out.println("Id: "+id);
            System.out.println("Opening crawl: "+open);
            System.out.println("Director: "+director);
            System.out.println("Producer: "+producer);
            System.out.println("Release_date: "+date);
            System.out.println("Link: "+url+"\n");
        }

    }
}