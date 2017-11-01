import java.util.List;
import java.util.ArrayList;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
  public static void main(String[] args) {
    port(3000);

    get("/", (req, res) -> "Hello World");

    path("/api", () -> {

      get("/animals", (req, res) -> {
        res.type("application/json");

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(new Animal(3, "Anders", 3));
        animals.add(new Animal(1, "Spot", 15));
        animals.add(new Animal(2, "Zippy", 6));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(animals);
      });

    }); // end API

  }

}
