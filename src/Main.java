import  javax.json.*;

public class Main {
    public static void main(String[] args) {


        String filmsJson = SwapiService.getFilmsJson("https://swapi.info/api/films");
        System.out.println(filmsJson);



    }
}